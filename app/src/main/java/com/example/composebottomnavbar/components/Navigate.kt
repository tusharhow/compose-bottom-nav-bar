package com.example.composebottomnavbar.components

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composebottomnavbar.views.HomeScreen
import com.example.composebottomnavbar.views.MailScreen
import com.example.composebottomnavbar.views.ProfileScreen
import com.example.composebottomnavbar.views.SearchScreen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainNavPage() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { MainBottomNavigation(navController = navController) }) {
        MainNavigation(navHostController = navController)
    }
}

@Composable
fun MainNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = BottomNavItem.Home.route,
    ) {
        composable(BottomNavItem.Home.route) {
            HomeScreen()
        }
        composable(BottomNavItem.Search.route) {
            SearchScreen()
        }
        composable(BottomNavItem.Profile.route) {
            ProfileScreen()
        }
        composable(BottomNavItem.Mail.route) {
            MailScreen()
        }

    }
}