package com.example.blogssu.controller

import com.example.blogssu.db.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class PostController {

    @PostMapping("/test/join")
    fun join(user: User): String {
        return "ok"
    }
}