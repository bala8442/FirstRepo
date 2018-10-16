package com.hexa.product.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	public static final Set<String> DEFAULT_PRODUCERS_CONSUMERS=new HashSet<>(Arrays.asList("application/json"));

	private ApiInfo apiInfo() {
		return new ApiInfo("Product Service", "Product", "", "", new Contact("", "", ""), "", "",
				Collections.emptyList());
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.produces(DEFAULT_PRODUCERS_CONSUMERS)
				.consumes(DEFAULT_PRODUCERS_CONSUMERS)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.hexa.product"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
				
	}

}

