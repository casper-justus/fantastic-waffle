package com.example.amperfy.domain.models

data class LoginCredentials(
    val serverUrl: String,
    val user: String,
    val token: String,
    val salt: String,
    val backendApi: Int
)
