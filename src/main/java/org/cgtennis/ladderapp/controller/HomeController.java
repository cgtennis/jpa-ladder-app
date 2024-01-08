package org.cgtennis.ladderapp.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

/*    @GetMapping("/")
    public String home(){
        return "Welcome to tennis ladder!";
    }*/

    @GetMapping("/")
    ResponseEntity<String> home(){
        return new ResponseEntity<>("Welcome to tennis ladder!", HttpStatus.OK);
    }

    @GetMapping("/tennis")
    ResponseEntity<String> tennis(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("My-Tennis-Header", "Yes, tennis!");
        return new ResponseEntity<>("Good, you like tennis!", headers, HttpStatus.ACCEPTED);
    }

    @GetMapping("/pickleball")
    ResponseEntity<String> pickleball(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("My-Tennis-Header", "no pickleball!");
        return new ResponseEntity<>("Bad, no pickleball here!", headers, HttpStatus.BAD_REQUEST);
    }
}
