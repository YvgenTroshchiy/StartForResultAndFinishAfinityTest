package com.troshchiy.startforresultandfinishafinitytest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        find<Button>(R.id.btn_next).setOnClickListener { startActivity<DetailsActivity>() }
    }
}