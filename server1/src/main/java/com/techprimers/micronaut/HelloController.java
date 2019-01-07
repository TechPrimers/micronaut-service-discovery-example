package com.techprimers.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hello")
public class HelloController {

    @Get("/")
    public String index() {
        return "Hello from Server 1";
    }
}