package com.example.amperfy.data.source.remote

import com.example.amperfy.domain.models.LoginCredentials
import io.ktor.client.*
import io.ktor.client.request.*
import javax.inject.Inject

class AmpacheApi @Inject constructor(
    private val httpClient: HttpClient
) {
    suspend fun ping(credentials: LoginCredentials): Result<Unit> {
        return try {
            httpClient.get("${credentials.serverUrl}/server/xml.server.php?action=ping")
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
