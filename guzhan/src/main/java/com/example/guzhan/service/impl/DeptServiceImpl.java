package com.example.guzhan.service.impl;

import com.example.guzhan.mapper.DeptMapper;
import com.example.guzhan.pojo.entity.Dept;
import com.example.guzhan.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

/**
 * <p>create at 2019/4/10</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept getDept(@NonNull final Integer no) {
        return this.deptMapper.getDept(no);
    }

    @Override
    public Integer getCount(Integer no) {
        return this.deptMapper.getCount(no); 
    }

}
