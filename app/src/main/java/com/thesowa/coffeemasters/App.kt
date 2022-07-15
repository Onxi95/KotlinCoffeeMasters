package com.thesowa.coffeemasters

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
    Scaffold(topBar = {
      TopAppBar {
          AppTitle()
      }
    }, bottomBar = {}) {
        OffersPage()
    }
}

@Composable
fun AppTitle() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Coffee masters")
    }
}