package com.carlmung.rest.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableAutoConfiguration
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@RequestMapping(value = "/book2", method = RequestMethod.PUT, produces = "application/json")
	public void bookPut(@RequestBody Book book, HttpServletRequest request) {
		System.out.println(request.getSession().getId());
		System.out.println(book.toString());
	}

}
