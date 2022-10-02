package com.sumit888.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.hide()

        var inputdate = findViewById<EditText>(R.id.edtdate)

        var input = findViewById<EditText>(R.id.edtInput)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            var intent = Intent(this,MainActivity3::class .java)
            intent.putExtra("key",input.text.toString())
            intent.putExtra("key2",inputdate.text.toString())
            startActivity(intent)


        }
    }
}