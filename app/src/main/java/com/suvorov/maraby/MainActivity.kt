package com.suvorov.maraby

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InflateColorBox()
        }
    }

    @Composable
    fun InflateCardView() = CardView(
        image = R.drawable.mountain,
        text = getString(R.string.mountain_text),
        withShadow = true,
    )

    @Composable
    fun InflateColorBox() = ColorBox(
        Modifier.fillMaxSize()
    )
}