package com.example.personalcash.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.personalcash.expenses.ExpenseScreen
import com.example.personalcash.login.LoginScreen
import com.example.personalcash.navigation.Screen.Expenses
import com.example.personalcash.navigation.Screen.Login

@Composable
fun SetupNavigationGraph() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Expenses.route) {
        composable(Login.route) { LoginScreen(navController) }
        composable(Expenses.route) { ExpenseScreen(navController) }
    }
}
