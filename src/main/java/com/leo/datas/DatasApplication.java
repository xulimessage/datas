package com.leo.datas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DatasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatasApplication.class, args);
	}
}
