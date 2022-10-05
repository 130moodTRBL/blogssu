package com.example.blogssu.repository

import com.example.blogssu.db.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}