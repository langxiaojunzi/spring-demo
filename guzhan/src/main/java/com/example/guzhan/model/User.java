package com.example.guzhan.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>created at 2019/11/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
public class User {
    /**
     * 姓名
     */
    @ExcelProperty(index = 0)
    private String name;

    /**
     * 年龄
     */
    @ExcelProperty(index = 1)
    private Integer age;

    @ExcelProperty(index = 2, converter = GenderConverter.class)
    private Integer gender;
}
