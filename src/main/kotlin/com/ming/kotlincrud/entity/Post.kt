package com.ming.kotlincrud.entity

import jakarta.persistence.*


@Entity
@Table(name = "posts")
class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var postId: Long? = null

    var title: String? = null

    var content: String? = null

    var writer : String? = null
}