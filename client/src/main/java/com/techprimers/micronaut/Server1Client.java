package com.techprimers.micronaut;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Client(id = "server1")
public interface Server1Client {

    @Get("/hello")
    public String helloFromServer1();
}