package com.example.amperfy.domain.repository

import com.example.amperfy.domain.models.LoginCredentials

interface LoginRepository {
    suspend fun login(credentials: LoginCredentials): Result<Unit>
}
