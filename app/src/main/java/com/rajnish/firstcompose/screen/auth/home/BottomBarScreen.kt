package com.rajnish.firstcompose.screen.auth.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomBarScreen(
    val route: String,
    val title:String,
    val icon:ImageVector
){
    object Home: BottomBarScreen(
        route = "HomeScreen",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Profile: BottomBarScreen(
        route = "ProfilePage",
        title = "Profile",
        icon = Icons.Default.Person
    )
    object Dashboard: BottomBarScreen(
        route = "DashboardPage",
        title = "Dashboard",
        icon = Icons.Default.Dashboard
    )
    object History: BottomBarScreen(
        route = "HistoryPage",
        title = "History",
        icon = Icons.Default.History
    )
}

