package com.mylearing.springsecurityjpa;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/admin")
    public String admin(){
        System.out.println("In ADmin");
        return ("<h1>Welcome Admin ..!!</h1>");
    }

    @GetMapping("/user")
    public String user(){
        System.out.println("In user");
        return ("<h1>Welcome User ..!!</h1>");
    }

    @GetMapping(path = "/")
    public String home(){
        System.out.println("In Home");
        return ("<h1>Welcome All ..!!</h1>");
    }

}
