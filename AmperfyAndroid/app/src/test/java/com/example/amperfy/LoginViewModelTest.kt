package com.example.amperfy

import com.example.amperfy.domain.usecases.LoginUseCase
import com.example.amperfy.viewmodels.LoginViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class LoginViewModelTest {

    @Mock
    private lateinit var loginUseCase: LoginUseCase

    private lateinit var viewModel: LoginViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        viewModel = LoginViewModel(loginUseCase)
    }

    @Test
    fun `login calls loginUseCase`() = runTest {
        val serverUrl = "http://example.com"
        val username = "user"
        val password = "password"

        viewModel.login(serverUrl, username, password)

        verify(loginUseCase).invoke(serverUrl, username, password)
    }
}
