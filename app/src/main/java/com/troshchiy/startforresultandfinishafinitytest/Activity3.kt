package com.troshchiy.startforresultandfinishafinitytest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        find<Button>(R.id.btn_next).setOnClickListener {
            finishForResult()
//            finishAffinity()
        }
    }
}
