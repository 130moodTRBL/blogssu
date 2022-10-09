package com.example.blogssu.service

import com.example.blogssu.db.User
import com.example.blogssu.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import java.lang.IllegalArgumentException
import java.util.function.Supplier

class UserServiceImpl @Autowired constructor (private val userRepository: UserRepository): UserService {
    override fun register(user: User) {
        userRepository.save(user)
    }

    override fun login(user: User): Boolean {
        val findUser: User = userRepository.findById(user.userId as Long)
            .orElseThrow { throw IllegalArgumentException()}

        if(findUser.email == user.email || findUser.password == user.password || findUser.username == user.username)
            return false
        return true
    }

    override fun withdrawal(user: User) {
        val findUser:User = userRepository.findById(user.userId as Long)
            .orElseThrow { throw IllegalArgumentException()}
        userRepository.delete(user)
    }
}