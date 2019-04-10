package com.example.demo.controller;

import com.example.demo.pojo.Dept;
import com.example.demo.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/hello")
    @ApiOperation(value = "测试", httpMethod = "GET")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "name", value = "名称", required = true),
    })
    public String get(@RequestParam String name) {

        return "hello " + name + " 一定要开心喔！！";
    }

    @GetMapping("/{no}")
    @ApiOperation(value = "根据编号查询部门信息", httpMethod = "GET")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "no", value = "部门编号", required = true, paramType = "path"),
    })
    public Dept get(@PathVariable(value = "no", required = false) Integer no) {
        return this.deptService.get(no);
    }
}
