package com.example.datacache.compand

import android.app.Activity
import android.os.Bundle
import com.example.datacache.utils.CallBack
import com.xiaolei.http.utils.AnnotationUtils

abstract class CompActivity: Activity(), CallBack{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnnotationUtils.regiester(this)
    }

}