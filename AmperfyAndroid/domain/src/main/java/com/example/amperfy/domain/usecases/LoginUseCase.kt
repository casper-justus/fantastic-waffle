package com.example.amperfy.domain.usecases

import com.example.amperfy.domain.models.LoginCredentials
import com.example.amperfy.domain.repository.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val loginRepository: LoginRepository
) {
    suspend operator fun invoke(serverUrl: String, user: String, token: String): Result<Unit> {
        // This is a simplified version. In a real app, you'd have more complex logic.
        val credentials = LoginCredentials(serverUrl, user, token, "", 0)
        return loginRepository.login(credentials)
    }
}
