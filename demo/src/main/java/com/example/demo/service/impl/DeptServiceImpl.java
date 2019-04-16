package com.example.demo.service.impl;

import com.example.demo.dao.DeptDao;
import com.example.demo.mapper.DeptMapper;
import com.example.demo.pojo.Dept;
import com.example.demo.service.DeptService;
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
    private DeptDao deptDao;
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(@NonNull final Integer no) {
//        return deptDao.get(no);
        return this.deptMapper.get(no);
    }
}
