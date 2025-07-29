package com.example.amperfy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amperfy.domain.usecases.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    fun login(serverUrl: String, user: String, token: String) {
        viewModelScope.launch {
            // In a real app, you'd handle the result of the login attempt
            loginUseCase(serverUrl, user, token)
        }
    }
}
