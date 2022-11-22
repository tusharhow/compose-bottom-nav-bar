package com.example.composebottomnavbar.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val icon: ImageVector, val label: String, val route: String,val notificationCount: Int) {
    object Home : BottomNavItem(icon = Icons.Default.Home, label = "Home", route = "home",notificationCount = 5)
    object Search : BottomNavItem(icon = Icons.Default.Search, label = "Search", route = "search",notificationCount = 3)
    object Mail : BottomNavItem(icon = Icons.Default.Email, label = "Email", route = "email",notificationCount = 2)
    object Profile : BottomNavItem(icon = Icons.Default.AccountCircle, label = "Profile", route = "profile",notificationCount = 6)

}