package com.example.datacache.utils

import com.example.datacache.entity.ResultInfo

interface CallBack {
    fun Successed(result: ResultInfo)
    fun Failure()
}