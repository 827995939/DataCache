package com.example.datacache.services

import com.example.datacache.utils.Api
import com.example.datacache.entity.UserEntity
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.Query

interface LoginService {

    @POST(Api.HOME)
    fun login(@Query("username") username: String, @Query("password") password: String):Observable<UserEntity>

}