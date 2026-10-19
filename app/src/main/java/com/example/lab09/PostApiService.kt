package com.example.lab09

import retrofit2.http.GET
import retrofit2.http.Path

// Define los endpoints. Retrofit genera la implementación en tiempo de ejecución.
interface PostApiService {

    @GET("posts")                    // GET {baseUrl}/posts
    suspend fun getUserPosts(): List<PostModel>

    @GET("posts/{id}")               // GET {baseUrl}/posts/5, por ejemplo
    suspend fun getUserPostById(@Path("id") id: Int): PostModel
}