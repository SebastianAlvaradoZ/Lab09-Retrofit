package com.example.lab09

import com.google.gson.annotations.SerializedName

// Data class que representa un "post" del JSON que devuelve la API.
data class PostModel(
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String,
    @SerializedName("link") val link: String?,                // puede venir null
    @SerializedName("comment_count") val commentCount: Int?   // en el JSON es "comment_count"
)