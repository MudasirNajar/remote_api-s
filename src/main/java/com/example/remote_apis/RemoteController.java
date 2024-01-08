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
    public Object getRemoteMovieDetails() {

        //The following url is from The Movies DB, they provide a unique key to identify the user
        String url = "https://api.themoviedb.org/3/movie/550?api_key=b858bffec9fd96eda2b9844c79cfb74a";
        return restTemplate.getForObject(url, Object.class);
    }

    //Getting the remote movie object with limited attributes, so here we're taking the incoming
    //object in MovieDetails object
    @GetMapping("/getRemoteMovieDetailsLimitedAttributes")
    public MovieDetails getRemoteMovieDetailsLimitedAttributes() {
        String url = "https://api.themoviedb.org/3/movie/550?api_key=b858bffec9fd96eda2b9844c79cfb74a";
        return restTemplate.getForObject(url, MovieDetails.class);
    }
}
