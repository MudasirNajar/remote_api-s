package com.example.remote_apis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RemoteController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getRemoteMovieDetails")
    public Object getRemoteMovieDetails(){
        return null;
    }
}
