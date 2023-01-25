package com.example.ourshop.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ourshop.screens.HomeScreen
import com.example.ourshop.screens.SplashScreen
import com.example.ourshop.screens.login.LoginScreen

@Composable
fun ShopNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ShopScreens.SplashScreen.name ){

        composable(ShopScreens.SplashScreen.name){
            SplashScreen(navController = navController)
        }
        
        composable(ShopScreens.LoginScreen.name){
            LoginScreen(navController = navController)
        }
        
        composable(ShopScreens.HomeScreen.name){
            HomeScreen(navController = navController)
        }
    }
    
}