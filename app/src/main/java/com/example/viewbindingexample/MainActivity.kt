package com.example.viewbindingexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var textName: TextView
    private lateinit var image: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init
        textName = findViewById(R.id.name)
        image = findViewById(R.id.image)
        button = findViewById(R.id.buttonFindMyAge)

        // set value
        textName.text = getString(R.string.name_firdaus)
        Glide.with(this).load(R.drawable.photo_daus).into(image)
        button.setOnClickListener {
            startActivity(Intent(this, FindMyAgeActivity::class.java))
        }
    }
}
