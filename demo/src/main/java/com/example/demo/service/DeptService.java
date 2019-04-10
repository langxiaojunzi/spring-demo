package com.example.demo.service;

import com.example.demo.pojo.Dept;
import org.springframework.lang.NonNull;

/**
 * <p>create at 2019/4/10</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public interface DeptService {
    Dept get(@NonNull final Integer no);
}
