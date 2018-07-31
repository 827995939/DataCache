package com.example.datacache.compand

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.datacache.utils.CallBack
import com.xiaolei.http.utils.AnnotationUtils

abstract class CompActivity: AppCompatActivity(), CallBack{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnnotationUtils.regiester(this)
    }

}