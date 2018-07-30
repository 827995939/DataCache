package com.example.datacache.entity

class ResultInfo {

    var code: Int = 0
    var message: String = ""
    private var body: Any? = null

    fun <T> body():T{
        return body as T
    }

    fun setBody(b:Any){
        this.body = b
    }
}
