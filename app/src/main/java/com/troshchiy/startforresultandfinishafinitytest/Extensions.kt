package com.troshchiy.startforresultandfinishafinitytest

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View

inline fun <reified T : View> Activity.find(id: Int): T = findViewById(id) as T

inline fun <reified T : Activity> Context.startActivity() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}

inline fun <reified T : Activity> Activity.startActivityForResult(requestCode: Int) {
    val intent = Intent(this, T::class.java)
    startActivityForResult(intent, requestCode)
}

fun Activity.finishForResult() {
    setResult(Activity.RESULT_OK, Intent())
    finish()
}
