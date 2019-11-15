package com.example.guzhan.model;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <p>created at 2019/10/17</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Data
@ApiModel
public class ExcelTeacherModel {
    /**
     * 教师名称
     */
    @ExcelProperty(value = "教师名称", index = 0)
    @ApiModelProperty(value = "教师名称")
    private String teacherName;
    /**
     * 性别
     */
    @ExcelProperty(value = "性别", index = 1)
    @ApiModelProperty(value = "性别")
    private Integer sex;
    /**
     * 手机号
     */
    @ExcelProperty(value = "手机号", index = 2)
    @ApiModelProperty(value = "手机号")
    private String mobile;
    /**
     * 入职时间
     */
    @ExcelProperty(value = "入职时间", index = 3)
    @ApiModelProperty(value = "入职时间")
    private Date hiredate;
    /**
     * 培训时间
     */
    @ExcelProperty(value = "培训时间", index = 4)
    @ApiModelProperty(value = "培训时间")
    private Date trainingDate;
    /**
     * 岗位
     */
    @ExcelProperty(value = "岗位", index = 5)
    @ApiModelProperty(value = "岗位")
    private String post;
    /**
     * 认证等级id
     */
    @ExcelProperty(value = "认证等级id", index = 6)
    @ApiModelProperty(value = "认证等级")
    private String level;
    /**
     * 证书编号
     */
    @ExcelProperty(value = "证书编号", index = 7)
    @ApiModelProperty(value = "证书编号")
    private String cerNo;

}
