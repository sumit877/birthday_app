package com.sumit888.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        supportActionBar?.hide()
        var song:MediaPlayer = MediaPlayer.create(this,R.raw.tune)
        song.start()

        var date1= intent.getStringExtra("key2")

        var name= intent.getStringExtra("key")

        var textname =findViewById<TextView>(R.id.textView4)
        var textdate= findViewById<TextView>(R.id.textView7)

        textname.setText("$name")
        textdate.setText("Lets rock party tonight and have fun today as it is your $date1 th birthday.")


    }
}