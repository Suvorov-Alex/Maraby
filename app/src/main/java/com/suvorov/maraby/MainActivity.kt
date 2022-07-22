package com.suvorov.maraby

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardView(
                image = R.drawable.mountain,
                text = getString(R.string.mountain_text),
                withShadow = true,
            )
        }
    }
}