package com.example.demo.mapper;

import com.example.demo.pojo.Dept;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

/**
 * <p>create at 2019/4/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Repository
public interface DeptMapper {
    Dept get(@NonNull final Integer no);
}
