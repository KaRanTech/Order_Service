package com.example.mindtree.orderdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Karunakar Pilli.
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket rulesApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.mindtree.orderdemo.controller"))
				.paths(PathSelectors.regex("/.*")).build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		return new ApiInfo("orderDemo-service", " ", "1.0", "Terms of service", new Contact("Demo", "L", ""), "", "");
	}
}
