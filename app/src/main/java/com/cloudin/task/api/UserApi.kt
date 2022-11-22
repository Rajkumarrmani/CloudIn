package com.cloudin.task.api

import androidx.lifecycle.MutableLiveData
import com.cloudin.task.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {

    @GET("api/?results=5")
    suspend fun getUserDetail(): Response<User>
}