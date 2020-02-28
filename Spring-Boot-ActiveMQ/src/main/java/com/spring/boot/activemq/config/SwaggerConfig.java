package com.spring.boot.activemq.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public static final Contact DEFAULT_CONTACT = new Contact("Rajesh Sadh", "https://rajeshsadh.com", "rajeshsadh121@gmail.com");
	public static final ApiInfo DEFAULT = new ApiInfo("ActiveMQ Api Title", "AciveMQ Api Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUME = new HashSet<String>(Arrays.asList("application/json","application/xml"));

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(DEFAULT)
        		.produces(DEFAULT_PRODUCES_AND_CONSUME)
        		.consumes(DEFAULT_PRODUCES_AND_CONSUME)
                .select().apis(RequestHandlerSelectors.basePackage("com.spring.boot.activemq"))
                //.paths(regex("/product.*"))
                .build();
    }
}