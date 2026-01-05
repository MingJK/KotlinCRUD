package com.ming.kotlincrud.controller

import com.ming.kotlincrud.entity.Post
import com.ming.kotlincrud.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController
    (private val postService: PostService) {
    @GetMapping("/list")
    fun list(): List<Post> {
        return postService.findAll()
    }
}