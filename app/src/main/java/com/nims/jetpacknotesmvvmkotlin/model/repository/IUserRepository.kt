package com.nims.jetpacknotesmvvmkotlin.model.repository

import com.nims.jetpacknotesmvvmkotlin.common.Result
import com.nims.jetpacknotesmvvmkotlin.model.User

interface IUserRepository {
    suspend fun getCurrentUser(): Result<Exception, User?>

    suspend fun signOutCurrentUser(): Result<Exception, Unit>

    suspend fun signInGoogleUser(idToken: String): Result<Exception, Unit>
}