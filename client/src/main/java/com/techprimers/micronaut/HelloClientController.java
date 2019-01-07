package com.techprimers.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/client")
public class HelloClientController {


    private Server1Client server1Client;
    private Server2Client server2Client;

    public HelloClientController(Server1Client server1Client, Server2Client server2Client)
    {
    this.server1Client = server1Client;
    this.server2Client = server2Client;
    }


    @Get("/server1")
    public String server1() {
        return server1Client.helloFromServer1();
    }
    @Get("/server2")
    public String server2() {
        return server2Client.helloFromServer2();
    }
}