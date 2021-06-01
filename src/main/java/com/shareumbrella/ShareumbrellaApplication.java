package com.shareumbrella;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shareumbrella.mapper")
@SpringBootApplication
public class ShareumbrellaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareumbrellaApplication.class, args);
	}

}
