package com.carlmung.rest.pcweb.service;

import com.carlmung.rest.pcweb.Book;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "book")
public interface BookService {

    @RequestMapping(value = "/book", method = RequestMethod.PUT, produces = "application/json")
    void bookPut(@RequestBody Book book);
}
