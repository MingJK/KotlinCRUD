package com.ming.kotlincrud.entity

import jakarta.persistence.*


@Entity
@Table(name = "posts")
class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val postId: Long? = null

    private val title: String? = null

    private val content: String? = null

    private val writer : String? = null
}