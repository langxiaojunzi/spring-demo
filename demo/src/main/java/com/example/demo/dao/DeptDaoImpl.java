package com.example.demo.dao;

import com.example.demo.pojo.Dept;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * <p>create at 2019/4/10</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Component
public class DeptDaoImpl implements DeptDao {
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final RowMapper<Dept> deptPlatformRowMapper = new BeanPropertyRowMapper<>(Dept.class);

    public DeptDaoImpl(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public Dept get(@NonNull final Integer no) {
        return this.jdbcTemplate.queryForObject("SELECT *\n" +
                "FROM dept\n" +
                "WHERE no = ?", deptPlatformRowMapper, no);
    }
}
