package com.example.blogssu.repository

import com.example.blogssu.db.Article
import org.springframework.data.jpa.repository.JpaRepository

interface ArticleRepository: JpaRepository<Article, Long> {
}