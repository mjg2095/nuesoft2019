package com.nuesoft.mvcweb002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = {"com.neusoft.busmis","com.nuesoft.busmis","com.nuesoft.mvcweb002.controller"})
@MapperScan(basePackages = {"com.neusoft.busmis.security.dao"})
public class Mvcweb002Application {

	public static void main(String[] args) {
		SpringApplication.run(Mvcweb002Application.class, args);
	}

}
