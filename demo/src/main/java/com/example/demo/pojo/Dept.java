package com.example.demo.pojo;

/**
 * <p>create at 2019/4/10</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Dept {
    private Integer no;
    private String name;
    private Integer number;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
