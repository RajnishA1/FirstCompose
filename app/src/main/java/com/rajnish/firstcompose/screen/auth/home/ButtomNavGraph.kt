package com.rajnish.firstcompose.screen.auth.home

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun ButtomNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
             ProfilePage()
        }

        composable(route = BottomBarScreen.Dashboard.route) {
              DashboardPage()
        }

        composable(route = BottomBarScreen.History.route) {
HistoryPage()
        }


    }
}