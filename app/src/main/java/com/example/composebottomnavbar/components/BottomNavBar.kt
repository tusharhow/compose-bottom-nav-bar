package com.example.composebottomnavbar.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun MainBottomNavigation(navController: NavController) {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Profile,

        BottomNavItem.Mail,
        BottomNavItem.Search
    )
    BottomNavigation(backgroundColor = Color.White, contentColor = Color.White) {

        val navStack by navController.currentBackStackEntryAsState()
        val currentRoute = navStack?.destination?.route

        items.forEach { item ->

            BottomNavigationItem(
                label = { Text(item.label) },
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let {
                            popUpTo(item.route)
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }, icon = {
                    BadgedBox(badge = {
                        if (currentRoute == item.route) {
                            Surface(
                                modifier = Modifier.padding(4.dp),
                                shape = CircleShape,
                                color = Color.Red
                            ) {
                                Text(
                                    text = item.notificationCount.toString(),
                                    style = TextStyle(fontSize = 8.sp),
                                    modifier = Modifier.padding(5.dp),
                                    color = Color.White
                                )
                            }
                        }
                    }) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }, alwaysShowLabel = true,

                selectedContentColor = Color.Blue,
                unselectedContentColor = Color.Gray
            )
        }
    }
}