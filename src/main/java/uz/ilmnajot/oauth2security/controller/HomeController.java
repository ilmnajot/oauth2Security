package uz.ilmnajot.oauth2security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    @GetMapping("/bye")
    public String bye(){
        return "bye";
    }
}
