package com.example.blogssu.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class PostController {

    @PostMapping("/test/join")
    fun join(username: String, password: String, email: String): String {
        println(username)
        println(password)
        println(email)
        return "ok"
    }
}