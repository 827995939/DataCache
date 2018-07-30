package com.example.datacache.compand

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.datacache.utils.CallBack
import com.xiaolei.http.utils.AnnotationUtils

abstract class CompFragment: Fragment(),CallBack {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnnotationUtils.regiester(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val ids = getLayout()
        init()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    abstract fun getLayout():Int
    abstract fun init()
}