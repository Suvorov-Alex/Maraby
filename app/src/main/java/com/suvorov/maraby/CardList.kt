package com.suvorov.maraby

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Simple Lazy Column
@Composable
fun SimpleList() {
    LazyColumn {
        itemsIndexed(
            listOf(
                "this",
                "is",
                "jetpack",
                "compose",
                "this",
                "is",
                "jetpack",
                "compose",
                "this",
                "is",
                "jetpack",
                "compose",
            )
        ) { item, string ->
            Text(
                text = string,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )

        }
    }
}

// CardView List
@Composable
fun CardList() {
    LazyColumn {
        items(50) {
            ComposeCardView()
        }
    }
}


// CardView Grid
@ExperimentalFoundationApi
@Composable
fun CardGrid() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        content = {
            items(50) {
                ComposeCardView()
            }
        }
    )
}