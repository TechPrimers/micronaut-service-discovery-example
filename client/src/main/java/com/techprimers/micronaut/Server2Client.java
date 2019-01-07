package com.techprimers.micronaut;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Client(id = "server2")
public interface Server2Client {

    @Get("/hello")
    public String helloFromServer2();
}