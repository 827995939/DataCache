package com.example.datacache

import android.app.Application
import com.xiaolei.http.utils.RetrofitOkhttp

class App :Application(){
    override fun onCreate() {
        super.onCreate()
        RetrofitOkhttp.BASE_URL = "http://172.16.7.119:3000/api/"
    }
}