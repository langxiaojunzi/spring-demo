package com.example.guzhan.pojo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>create at 2019/4/10</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Dept {
    private Integer no;
    private String name;
    private Integer number;

    public Dept(Integer no, String name, Integer number) {
        this.no = no;
        this.name = name;
        this.number = number;
    }
}
