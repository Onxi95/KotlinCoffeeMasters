package com.thesowa.coffeemasters

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun Offer() {
    Column() {
        Text(text = "Title", fontSize = 16.sp)
        Text(text = "Description")
    }
}