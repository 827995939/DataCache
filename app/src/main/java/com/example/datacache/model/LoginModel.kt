package com.example.datacache.model

import com.example.datacache.entity.ProgramEntity
import com.example.datacache.utils.CallBack
import com.example.datacache.entity.ResultInfo
import com.example.datacache.entity.UserEntity
import com.example.datacache.services.LoginService
import com.xiaolei.http.annotation.Services

class LoginModel() :ILoginModel{

    override var callBack: CallBack? = null

    @JvmField
    @Services("LoginService") var userService: LoginService? =null

    override fun login() {
        var result=ResultInfo()
        result.code = 123
        var u = UserEntity()
        u.id =123

        var p = ProgramEntity()
        p.id = 0
        result.setBody(p)
        callBack?.Successed(result)

//        val observer: Observable<UserEntity>? = userService?.login("","")
//        observer?.subscribe(
//                { result -> Log.i("Tag","") },
//                { error -> Log.i("Tag","") },
//                { -> Log.i("Tag","") })
    }

}