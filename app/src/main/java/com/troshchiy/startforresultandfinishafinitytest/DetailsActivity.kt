package com.troshchiy.startforresultandfinishafinitytest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    private val TAG = getLogTag<DetailsActivity>()

    companion object {
        val REQUEST_CODE = 44556677
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        find<Button>(R.id.btn_next).setOnClickListener { startActivityForResult<Activity1>(REQUEST_CODE) }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        logW(TAG, "onActivityResult. requestCode: $requestCode, resultCode: $resultCode, data: $data")

        if (resultCode != Activity.RESULT_OK || requestCode != REQUEST_CODE) return

        find<TextView>(R.id.tv).text = "TADAM!"
    }
}