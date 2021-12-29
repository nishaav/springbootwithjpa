package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.entities.User;
import com.cg.service.UserService;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.cg.entities"})
public class JpaWithSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(JpaWithSpringBootApplication.class, args);
	
		
		String name="Geetika";
		String contact="98749384";
		UserService userService=ctx.getBean(UserService.class);
		String status=userService.addRecord( name, contact);
		System.out.println(status);
	}

}
