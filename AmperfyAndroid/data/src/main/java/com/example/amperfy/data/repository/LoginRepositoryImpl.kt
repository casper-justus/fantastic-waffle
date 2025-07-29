package com.example.amperfy.data.repository

import com.example.amperfy.data.source.remote.LoginRemoteDataSource
import com.example.amperfy.domain.models.LoginCredentials
import com.example.amperfy.domain.repository.LoginRepository
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val remoteDataSource: LoginRemoteDataSource
) : LoginRepository {
    override suspend fun login(credentials: LoginCredentials): Result<Unit> {
        return remoteDataSource.login(credentials)
    }
}
