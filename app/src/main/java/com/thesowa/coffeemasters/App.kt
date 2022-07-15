package com.thesowa.coffeemasters

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.thesowa.coffeemasters.pages.InfoPage

@Preview
@Composable
fun App() {

    var currentPage = remember {
        mutableStateOf(Routes.MenuPage.route)
    }
    Scaffold(topBar = {
      TopAppBar {
          AppTitle()
      }
    }, bottomBar = {
        NavBar(
            selectedRoute = currentPage.value,
            onChange = { newRoute ->
            currentPage.value = newRoute
        })
    }) {
        when(currentPage.value) {
            Routes.MenuPage.route -> Text(text = "Menu")
            Routes.OffersPage.route -> OffersPage()
            Routes.OrderPage.route -> Text(text = "Order")
            Routes.InfoPage.route -> InfoPage()
        }
    }
}

@Composable
fun AppTitle() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Coffee masters")
    }
}