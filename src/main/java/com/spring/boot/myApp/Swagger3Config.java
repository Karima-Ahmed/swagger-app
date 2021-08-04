package com.spring.boot.myApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class Swagger3Config {//to test ui: http://localhost:8080/swagger-ui/index.html
                            //to test api: http://localhost:8080/v2/api-docs

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.spring.boot.myApp"))//to ignore error controller
                .paths(PathSelectors.any())
                .build();
    }

}

