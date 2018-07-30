package com.example.datacache

import com.example.datacache.compand.CompFragment
import com.example.datacache.entity.ResultInfo

class MainFragment: CompFragment() {

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun init() {

    }

    override fun Successed(result: ResultInfo) {

    }

    override fun Failure() {

    }
}