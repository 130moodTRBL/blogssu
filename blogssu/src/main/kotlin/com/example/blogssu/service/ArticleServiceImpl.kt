package com.example.blogssu.service

import com.example.blogssu.db.Article
import com.example.blogssu.repository.ArticleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.transaction.annotation.Transactional

class ArticleServiceImpl @Autowired constructor(val articleRepository: ArticleRepository): ArticleService{

    @Transactional
    override fun write(article: Article) {
        articleRepository.save(article)
    }
}