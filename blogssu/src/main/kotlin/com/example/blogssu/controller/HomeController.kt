package com.example.blogssu.controller

import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@Controller
class HomeController {

    @GetMapping("/home")
    fun home(): String {
        println("home")
        return "home"
    }
}