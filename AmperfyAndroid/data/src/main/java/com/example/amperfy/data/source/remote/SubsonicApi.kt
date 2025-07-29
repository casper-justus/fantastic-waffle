package com.example.amperfy.data.source.remote

import com.example.amperfy.domain.models.LoginCredentials
import io.ktor.client.*
import io.ktor.client.request.*
import javax.inject.Inject

class SubsonicApi @Inject constructor(
    private val httpClient: HttpClient
) {
    suspend fun ping(credentials: LoginCredentials): Result<Unit> {
        return try {
            httpClient.get("${credentials.serverUrl}/rest/ping.view") {
                parameter("u", credentials.user)
                parameter("t", credentials.token)
                parameter("s", credentials.salt)
                parameter("v", "1.16.1")
                parameter("c", "amperfy")
            }
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
