package com.example.blogssu.controller

import com.example.blogssu.db.User
import com.example.blogssu.response.UserResponse
import com.example.blogssu.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class UserController @Autowired constructor(private val userService: UserService) {

    @PostMapping("/blog/register")
    fun register(@RequestBody user: User): UserResponse {
        userService.register(user)
        return UserResponse(user.email, user.username)
    }

    @PostMapping("/blog/login")
    fun login(@RequestBody user: User): String {
        userService.login(user)
        return "login"
    }

    @PostMapping("/blog/delete")
    fun delete(@RequestBody user: User): String {
        userService.withdrawal(user)
        return "delete"
    }
}