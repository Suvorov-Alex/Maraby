package com.suvorov.maraby

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedBox() {
    var boxSizeState by remember { mutableStateOf(200.dp) }
    val infiniteTransition = rememberInfiniteTransition()
    val color by infiniteTransition.animateColor(
        initialValue = Color.Red,
        targetValue = Color.Green,
        animationSpec = infiniteRepeatable(tween(durationMillis = 2000), RepeatMode.Reverse)
    )
    val size by animateDpAsState(
        targetValue = boxSizeState,

        //tween(durationMillis = 2000, delayMillis = 200, easing = LinearOutSlowInEasing),

        //spring(Spring.DampingRatioHighBouncy),

        /*keyframes {
            durationMillis = 5000
            boxSizeState at 0 with LinearEasing
            boxSizeState * 1.5f at 1000 with FastOutLinearInEasing
            boxSizeState * 2f at 5000
        }*/

        tween(durationMillis = 1000),
    )

    Box(
        modifier = Modifier
            .size(size)
            .background(color),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = {
            boxSizeState += 50.dp
        }) {
            Text(text = "Increase Size")
        }
    }
}