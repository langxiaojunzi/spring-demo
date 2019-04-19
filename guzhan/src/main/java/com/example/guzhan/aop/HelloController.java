package com.example.guzhan.aop;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>create at 2019/4/19</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@RestController
@Api(tags = "Hello")
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation(value = "测试", httpMethod = "GET")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "name", value = "名称", required = true),
    })
    public String get(@RequestParam String name) {
        log.info("name={}", name);
        return "hello " + name + " 一定要开心喔！！";
    }
}
