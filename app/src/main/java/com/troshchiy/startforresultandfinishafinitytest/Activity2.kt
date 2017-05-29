package com.troshchiy.startforresultandfinishafinitytest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.troshchiy.startforresultandfinishafinitytest.DetailsActivity.Companion.REQUEST_CODE

class Activity2 : AppCompatActivity() {
    private val TAG = getLogTag<Activity2>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        find<Button>(R.id.btn_next).setOnClickListener { startActivityForResult<Activity3>(REQUEST_CODE) }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        logW(TAG, "onActivityResult. requestCode: $requestCode, resultCode: $resultCode, data: $data")
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE) finishForResult()
    }
}