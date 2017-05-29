package com.troshchiy.startforresultandfinishafinitytest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.troshchiy.startforresultandfinishafinitytest.DetailsActivity.Companion.REQUEST_CODE

class Activity1 : AppCompatActivity() {
    private val TAG = getLogTag<Activity1>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        find<Button>(R.id.btn_next).setOnClickListener { startActivityForResult<Activity2>(REQUEST_CODE) }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        logW(TAG, "onActivityResult. requestCode: $requestCode, resultCode: $resultCode, data: ${data?.extras}")
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE) {
//            setResult(Activity.RESULT_OK, Intent()
//                    intent.extras)
            finish()
//            finishForResult()
        }
    }
}