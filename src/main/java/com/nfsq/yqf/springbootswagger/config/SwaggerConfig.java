package com.nfsq.yqf.springbootswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by qfyu
 * Date:2018/12/6
 * Time:21:04
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.nfsq.yqf.springbootswagger.controller")).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("测试swagger接口").description("俞权锋项目").termsOfServiceUrl("http://www.quf.com").version("1.0").build();
    }
}
