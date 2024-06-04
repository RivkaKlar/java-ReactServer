package com.example.webapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController//הגדרה זו גורמת ל class להיות controller
@RequestMapping("/home")//הכתובת שעליה ירוץ  controller זה

public class HomeController {

 @GetMapping//פונקציית get
    public String home(){
        return "rivky";
    }
}
