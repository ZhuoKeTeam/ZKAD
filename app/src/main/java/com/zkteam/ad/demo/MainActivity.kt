package com.zkteam.ad.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zkteam.ad.ZKADManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ZKADManager.instance.init()
    }
}
