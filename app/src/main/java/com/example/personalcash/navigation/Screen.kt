package com.example.personalcash.navigation

sealed class Screen(val route: String) {
    object Login : Screen("home")
    object Expenses : Screen("profile")
}
