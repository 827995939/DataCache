package com.example.datacache

import android.os.Bundle
import android.util.Log
import com.example.datacache.compand.CompActivity
import com.example.datacache.entity.ResultInfo
import com.example.datacache.entity.UserEntity
import com.example.datacache.model.ILoginModel
import com.xiaolei.http.annotation.Models

class MainActivity : CompActivity() {

    @JvmField
    @Models(name = "ILoginModel") var loginModel: ILoginModel?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginModel?.callBack = this
        loginModel?.login()
        Log.i("TAG","")
    }

    override fun Failure() {
        Log.i("TAG","Failure")
    }

    override fun Successed(result: ResultInfo) {
        when(result.code){
            1-> Log.i("Tag","1")
            2-> Log.i("Tag","2")
            3-> Log.i("Tag","3")
        }
        var body = result.body<UserEntity>()
        Log.i("TAG","Successed")
    }

}
