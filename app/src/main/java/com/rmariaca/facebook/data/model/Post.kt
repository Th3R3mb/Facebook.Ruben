package com.rmariaca.facebook.data.model

data class Post(
    val id: Int,
    val author: String,
    val time: String,
    val content: String,
    val likes: Int,
    val comments: Int
)
