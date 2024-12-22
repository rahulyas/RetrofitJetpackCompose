package com.rahul.retrofitjetpackcompose.api

import com.rahul.retrofitjetpackcompose.model.Post

fun interface PostRepository {
    suspend fun getPosts(): List<Post>
}
