package com.ming.kotlincrud.service

import com.ming.kotlincrud.entity.Post
import com.ming.kotlincrud.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService
    (private val postRepository : PostRepository) {

    public fun findAll(): List<Post> {
        return postRepository.findAll()
    }

    public fun save(post : Post): Post {
        return postRepository.save(post)
    }

    public fun deleteById(id: Long) {
        return postRepository.deleteById(id)
    }


}