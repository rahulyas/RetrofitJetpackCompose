package com.rahul.retrofitjetpackcompose.api

import com.rahul.retrofitjetpackcompose.model.Post
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : PostRepository {
    override suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}
