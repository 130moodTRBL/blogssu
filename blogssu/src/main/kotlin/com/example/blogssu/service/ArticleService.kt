package com.example.blogssu.service

import com.example.blogssu.db.Article

interface ArticleService {
    fun write(article: Article)
}