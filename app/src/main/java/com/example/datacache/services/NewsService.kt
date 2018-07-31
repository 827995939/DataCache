package com.example.datacache.services

import com.example.datacache.entity.NewsContentEntity
import com.example.datacache.utils.Api
import io.reactivex.Observable
import retrofit2.http.GET

interface NewsService {
    @GET(Api.NEWS_CONTENT)
    fun Query(): Observable<NewsContentEntity>

    @GET(Api.HOME)
    fun getNewsContent(): Observable<List<NewsContentEntity>>
}