package com.example.blogssu.member

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member (@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val Id: Int, val Password: Int, val email: String) {

}