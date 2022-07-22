package com.suvorov.maraby

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// CardView with Image, Text and Shadow
@Composable
fun CardView(
    @DrawableRes image: Int,
    text: String = "",
    withShadow: Boolean = false,
) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(300.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
    ) {
        Box {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.Crop,
            )
            if (withShadow) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Brush.verticalGradient(colors = listOf(Color.Transparent, Color.Black)))
                )
            }
            if (text.isNotEmpty()) {
                Text(
                    modifier = Modifier
                        .padding(12.dp)
                        .align(Alignment.BottomStart),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 16.sp,
                    ),
                    text = text
                )
            }
        }
    }
}