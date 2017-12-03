package com.carlmung.rest.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@RequestMapping(value = "/book", method = RequestMethod.PUT, produces = "application/json")
	public void bookPut(@RequestBody Book book) {
		System.out.println(book.toString());
	}

}
