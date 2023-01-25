package com.example.ourshop.navigation

enum class ShopScreens {
    SplashScreen,
    LoginScreen,
    CreateAccountScreen,
    HomeScreen;
    companion object{
        fun fromRoute(route: String): ShopScreens
        = when (route?. substringBefore("/")){
            SplashScreen.name -> SplashScreen
            LoginScreen.name -> LoginScreen
            CreateAccountScreen.name -> CreateAccountScreen
            HomeScreen.name -> HomeScreen
            null -> HomeScreen

            else ->throw IllegalArgumentException("Route $route is not recognised")
        }
    }
}