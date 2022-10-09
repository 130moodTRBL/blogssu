package com.example.blogssu.controller

import com.example.blogssu.db.Article
import com.example.blogssu.response.ArticleResponse
import com.example.blogssu.service.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class ArticleController @Autowired constructor(val articleService: ArticleService) {

    @PostMapping("blog/write")
    fun write(@RequestBody article: Article, ): ArticleResponse {
        articleService.write(article)
        return ArticleResponse()
    }
}