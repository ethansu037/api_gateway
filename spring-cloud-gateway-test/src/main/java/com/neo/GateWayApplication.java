package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);
	}

//	@Bean
//	public RouteLocator studentRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("student_path_route", r -> r.path("/student-api/**")
//						.uri("http://localhost:9099"))		
//				.build();
//	}
//	
//	@Bean
//	public RouteLocator courseRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("course_path_route", r -> r.path("/course-api/**")
//						.uri("http://localhost:8098"))
//				.build();
//	}	

}
