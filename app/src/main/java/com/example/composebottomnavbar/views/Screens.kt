package com.example.composebottomnavbar.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MailScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Mail Screen", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun ProfileScreen() {
 Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Profile Screen", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun SearchScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Search Screen", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Home Screen", modifier = Modifier.align(Alignment.Center))
    }
}