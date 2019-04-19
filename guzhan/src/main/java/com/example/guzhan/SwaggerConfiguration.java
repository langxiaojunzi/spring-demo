package com.example.guzhan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>create at 2019/4/19</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(
                        new ApiInfoBuilder()
                                .title("guzhan测试")
                                .description("测试而已啦")
                                .version("v0.1.0")
                                .build()
                )
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.guzhan"))
                .paths(PathSelectors.any())
                .build()
                .enableUrlTemplating(false);
    }
}
