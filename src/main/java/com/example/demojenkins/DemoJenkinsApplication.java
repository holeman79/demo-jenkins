package com.example.demojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static void main(String[] args) {

		System.out.println("LocalDateTime.now : " + LocalDateTime.now());
		System.out.println("ZonedDateTimeToLocalDateTime : " + ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toLocalDateTime());
		System.out.println("LocalDateTime.now(Asia/Seoul)" + LocalDateTime.now(ZoneId.of("Asia/Seoul")));
		System.out.println("ZonedDateTime.now : " + ZonedDateTime.now());
		System.out.println("ZonedDateTime.now(Asia/Seoul) : " + ZonedDateTime.now(ZoneId.of("Asia/Seoul")));
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
