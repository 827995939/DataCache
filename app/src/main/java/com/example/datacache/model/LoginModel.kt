package com.example.datacache.model

import android.util.Log
import com.example.datacache.entity.ProgramEntity
import com.example.datacache.utils.CallBack
import com.example.datacache.entity.ResultInfo
import com.example.datacache.entity.UserEntity
import com.example.datacache.services.LoginService
import com.example.datacache.services.NewsService
import com.xiaolei.http.annotation.Services
import com.xiaolei.http.utils.RetrofitOkhttp
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LoginModel() :ILoginModel{

    override var callBack: CallBack? = null

    @JvmField
    @Services("LoginService") var userService: LoginService? =null

    @JvmField
    @Services("NewsService") var newsService: NewsService? =null

    override fun login() {
//        val observer = newsService?.Query()
//        observer?.subscribeOn(Schedulers.computation())
//                ?.observeOn(AndroidSchedulers.mainThread())
//                ?.subscribe({ result ->
//                    var r  = ResultInfo()
//                    r.code= 123
//                    r.setBody(result)
//                    callBack?.Successed(r)
//                    Log.i("Tag","") },
//                { error ->
//                    Log.i("Tag","")
//                },
//                { ->
//                    Log.i("Tag","")
//                })
        val observer = newsService?.getNewsContent()
        observer?.subscribeOn(Schedulers.computation())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe({ result ->
                    var r  = ResultInfo()
                    r.code= 123
                    r.setBody(result)
                    callBack?.Successed(r)
                    Log.i("Tag","") },
                        { error ->
                            Log.i("Tag","")
                        },
                        { ->
                            Log.i("Tag","")
                        })

        Log.i("Tag","")
//        val observer: Observable<UserEntity>? = userService?.login("","")
//        observer?.subscribe(
//                { result -> Log.i("Tag","") },
//                { error -> Log.i("Tag","") },
//                { -> Log.i("Tag","") })
    }

}