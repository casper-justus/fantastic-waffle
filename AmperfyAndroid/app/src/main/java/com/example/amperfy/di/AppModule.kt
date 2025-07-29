package com.example.amperfy.di

import com.example.amperfy.data.repository.LoginRepositoryImpl
import com.example.amperfy.data.source.remote.LoginRemoteDataSource
import com.example.amperfy.domain.repository.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.engine.android.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideHttpClient(): HttpClient {
        return HttpClient(Android)
    }

    @Provides
    @Singleton
    fun provideLoginRepository(
        remoteDataSource: LoginRemoteDataSource
    ): LoginRepository {
        return LoginRepositoryImpl(remoteDataSource)
    }
}
