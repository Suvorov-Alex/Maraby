package com.suvorov.maraby

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ComposeCardView() = CardView(
    image = R.drawable.mountain,
    text = "Mountain",
    withShadow = true,
)

@Composable
fun ComposeColorBox() = ColorBox(
    Modifier.fillMaxSize()
)

@Composable
fun ComposeGreetingScreen() = GreetingScreen()

@Composable
fun ComposeSimpleList() = SimpleList()

@Composable
fun ComposeCardList() = CardList()

@Composable
fun ComposeCardGrid() = CardGrid()

@Composable
fun ComposeConstraintView() = ConstraintView()

@Composable
fun ComposeAnimatedBox() = AnimatedBox()