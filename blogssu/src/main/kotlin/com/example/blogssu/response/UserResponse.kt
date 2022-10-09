package com.example.blogssu.response

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@AllArgsConstructor
data class UserResponse (
    val email: String, val username: String
    )