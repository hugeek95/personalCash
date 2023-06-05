package com.example.personalcash.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    NavigationBar(rememberNavController())
}

@Composable
fun NavigationBar(navController: NavHostController) {
    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black,
        elevation = 0.dp
    ) {
        val currentRoute = currentRoute(navController)
        BottomNavigation {
            BottomNavigationItem(
                icon = { },
                label = { Text(text = "Home") },
                selected = true,
                onClick = { /* Acción al hacer clic en Home */ }
            )
            BottomNavigationItem(
                icon = { },
                label = { Text(text = "Search") },
                selected = false,
                onClick = { /* Acción al hacer clic en Search */ }
            )
            BottomNavigationItem(
                icon = { },
                label = { Text(text = "Profile") },
                selected = false,
                onClick = { /* Acción al hacer clic en Profile */ }
            )
        }
    }
}
