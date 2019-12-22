package com.xr.springboot1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication

@MapperScan("com.xr.springboot1.dao")

public class Springboot1Application extends SpringBootServletInitializer {


    	@Override
    
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
   
	     return builder.sources(Springboot1Application.class);
    
	}

    
	public static void main(String[] args) {
        
		SpringApplication.run(Springboot1Application.class, args);
    
	}


}
