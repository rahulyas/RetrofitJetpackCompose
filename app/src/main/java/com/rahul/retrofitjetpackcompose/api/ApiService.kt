package com.rahul.retrofitjetpackcompose.api

import com.rahul.retrofitjetpackcompose.model.Post
import retrofit2.http.GET

fun interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
