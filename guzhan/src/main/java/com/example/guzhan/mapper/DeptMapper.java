package com.example.guzhan.mapper;

import com.example.guzhan.pojo.entity.Dept;
import org.apache.ibatis.annotations.Param;
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
    Dept getDept(@Param("no") @NonNull final Integer no);

    Integer getCount(@Param("no") Integer no);
}
