package com.example.activityresultlauncher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    fun clickAct2(view: View){
        val intent = Intent()
        intent.putExtra("key", "all ok")
        setResult(RESULT_OK, intent)
        finish()
    }

}