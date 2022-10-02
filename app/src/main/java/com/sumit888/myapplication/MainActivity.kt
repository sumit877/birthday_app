package com.sumit888.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.xml.sax.HandlerBase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

            Handler().postDelayed({

                var intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            },2000)

    }
}