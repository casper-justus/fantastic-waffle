package com.example.amperfy.domain.models

data class Artwork(
    val id: String,
    val type: String,
    val status: Int,
    val relFilePath: String?
)
