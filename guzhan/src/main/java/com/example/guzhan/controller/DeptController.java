package com.example.guzhan.controller;

import com.example.guzhan.pojo.entity.Dept;
import com.example.guzhan.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>create at 2019/4/10</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@RestController
@RequestMapping("/dept")
@Api(tags = "测试")
@Slf4j
public class DeptController {
    @Autowired
    private DeptService deptService;


    @GetMapping("get-dept/{no}")
    @ApiOperation(value = "根据编号查询部门信息", httpMethod = "GET")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "no", value = "部门编号", required = true, paramType = "path"),
    })
    public Dept getDept(@PathVariable(value = "no", required = false) Integer no) {
        return this.deptService.getDept(no);
    }

    @GetMapping("get-count/{no}")
    @ApiOperation(value = "根据编号查询部门数量", httpMethod = "GET")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "no", value = "部门编号", required = true, paramType = "path"),
    })
    public Integer getCount(@PathVariable(value = "no", required = false) Integer no) {
        return this.deptService.getCount(no);
    }
}
