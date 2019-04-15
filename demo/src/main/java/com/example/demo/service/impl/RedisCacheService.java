package com.example.demo.service.impl;


import com.alibaba.fastjson.JSON;
import com.example.demo.service.CacheService;
import com.example.demo.util.StringUtilsEx;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * <br>created at 18-1-25
 *
 * @author liuxh
 * @since 0.1.0
 */
@Service("redisCacheService")
public class RedisCacheService implements CacheService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    @Qualifier("stringRedisTemplate")
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String set(String k, String v) {
        byte[] key = StringUtilsEx.bytes(k);
        byte[] value = StringUtilsEx.bytes(v);
        return stringRedisTemplate.execute((RedisCallback<String>) redisConnection -> {
            redisConnection.set(key, value);
            return v;
        });
    }

    /**
     * 以k-v方式将数据存储到Redis中
     *
     * @param k   键
     * @param v   值对象,将对象转为json格式存储,如果v为空,则存储@IDO
     * @param <T> 值对象类
     * @return 值类
     */
    @Override
    public <T> T set(String k, T v) {
        byte[] key = StringUtilsEx.bytes(k);
        byte[] value = v == null ? StringUtilsEx.bytes(NULL_VALUE) : StringUtilsEx.bytes(JSON.toJSONString(v));
        return stringRedisTemplate.execute((RedisCallback<T>) redisConnection -> {
            redisConnection.set(key, value);
            return v;
        });
    }

    @Override
    public String setEx(String k, String v, long time) {
        byte[] key = StringUtilsEx.bytes(k);
        byte[] value = StringUtilsEx.bytes(v);
        return stringRedisTemplate.execute((RedisCallback<String>) redisConnection -> {
            redisConnection.setEx(key, time, value);
            return v;
        });
    }

    /**
     * 以k-v方式将数据存储到Redis中,过期时间为time,单位秒
     *
     * @param k    键
     * @param v    值,如果v为空,则存储@IDO
     * @param time 过期时间,单位秒
     * @param <T>  对象
     * @return 对象
     */
    @Override
    public <T> T setEx(String k, T v, long time) {
        byte[] key = StringUtilsEx.bytes(k);
        byte[] value = v == null ? StringUtilsEx.bytes(NULL_VALUE) : StringUtilsEx.bytes(JSON.toJSONString(v));
        return stringRedisTemplate.execute((RedisCallback<T>) redisConnection -> {
            redisConnection.setEx(key, time, value);
            return v;
        });
    }

    @Override
    public boolean setNX(String k, String v) {
        byte[] key = StringUtilsEx.bytes(k);
        byte[] value = StringUtilsEx.bytes(v == null ? NULL_VALUE : v);
        return stringRedisTemplate
                .execute((RedisCallback<Boolean>) redisConnection -> redisConnection.setNX(key, value));
    }

    @Override
    public void expire(String k, long expire) {
        if (StringUtils.isBlank(k)) {
            return;
        }
        byte[] key = StringUtilsEx.bytes(k);
        stringRedisTemplate.execute((RedisCallback<Boolean>) connection -> {
            connection.expire(key, expire);
            return Boolean.TRUE;
        });
    }

    @Override
    public Optional<String> get(String k) {
        if (k == null) {
            return Optional.empty();
        }
        byte[] key = StringUtilsEx.bytes(k);
        String value = stringRedisTemplate.execute((RedisCallback<String>) connection -> {
            byte[] bytes = connection.get(key);
            return StringUtilsEx.str(bytes);
        });
        if (NULL_VALUE.equals(value)) {
            value = null;
        }
        return Optional.ofNullable(value);
    }

    @Override
    public <T> Optional<T> get(String k, Class<T> clazz) {
        if (k == null) {
            return Optional.empty();
        }
        byte[] key = StringUtilsEx.bytes(k);
        String value = stringRedisTemplate.execute((RedisCallback<String>) connection -> {
            byte[] bytes = connection.get(key);
            return StringUtilsEx.str(bytes);
        });
        if (NULL_VALUE.equals(value)) {
            value = null;
        }
        return value == null ? Optional.empty() : Optional.ofNullable(JSON.parseObject(value, clazz));
    }

    @Override
    public Long del(String k) {
        byte[] key = StringUtilsEx.bytes(k);
        return stringRedisTemplate.execute((RedisCallback<Long>) redisConnection -> redisConnection.del(key));
    }
}
