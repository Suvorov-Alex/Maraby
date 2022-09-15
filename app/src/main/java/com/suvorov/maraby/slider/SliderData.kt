package com.suvorov.maraby.slider

import com.suvorov.maraby.R

data class SliderData(
    val title: String,
    val image: Int,
)

val sliderDataList = listOf(
    SliderData(
        "1",
        R.drawable.mountain,
    ),
    SliderData(
        "2",
        R.drawable.srbia,
    ),
    SliderData(
        "3",
        R.drawable.spb,
    ),
)