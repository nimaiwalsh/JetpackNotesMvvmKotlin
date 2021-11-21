package com.nims.jetpacknotesmvvmkotlin.login.buildlogic

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nims.jetpacknotesmvvmkotlin.login.UserViewModel
import com.nims.jetpacknotesmvvmkotlin.model.repository.IUserRepository
import kotlinx.coroutines.Dispatchers

class UserViewModelFactory(
    private val userRepo: IUserRepository
): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return UserViewModel(userRepo, Dispatchers.Main) as T
    }

}