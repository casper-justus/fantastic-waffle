package com.example.amperfy.data.repository

import com.example.amperfy.data.source.remote.AmpacheApi
import com.example.amperfy.data.source.remote.SubsonicApi
import com.example.amperfy.domain.models.LoginCredentials
import com.example.amperfy.domain.repository.LoginRepository
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val ampacheApi: AmpacheApi,
    private val subsonicApi: SubsonicApi
) : LoginRepository {
    override suspend fun login(credentials: LoginCredentials): Result<Unit> {
        // A more sophisticated approach would be to try both and see which one succeeds
        return ampacheApi.ping(credentials)
    }
}
