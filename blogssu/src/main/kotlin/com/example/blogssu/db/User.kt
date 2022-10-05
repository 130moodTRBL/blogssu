package com.example.blogssu.db

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.Getter
import lombok.NoArgsConstructor
import org.hibernate.annotations.CreationTimestamp
import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
open class User (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var userId: Long? = null,

    @Column(name = "email")
    var email: String,

    @Column(name = "password")
    var password: String,

    @Column(name = "username")
    var username: String,

    @CreationTimestamp
    var cratedDate: Timestamp,
        )