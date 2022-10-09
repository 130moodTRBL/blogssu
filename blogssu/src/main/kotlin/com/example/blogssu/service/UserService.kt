package com.example.blogssu.service

import com.example.blogssu.db.User

interface UserService {
    fun register(user: User)
    fun login(user: User): Boolean
    fun withdrawal(user: User)
}