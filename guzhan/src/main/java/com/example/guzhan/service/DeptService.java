package com.example.guzhan.service;

import com.example.guzhan.pojo.entity.Dept;
import org.springframework.lang.NonNull;

/**
 * <p>create at 2019/4/10</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public interface DeptService {
    Dept getDept(@NonNull final Integer no);

    Integer getCount(Integer no);
}
