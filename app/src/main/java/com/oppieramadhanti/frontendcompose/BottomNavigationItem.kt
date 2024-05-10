package com.oppieramadhanti.frontendcompose

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val title: String,
    val selectedIcon : ImageVector,
    val unSelectedIcon : ImageVector,

    val route: String,
)

val listOfNavItems = listOf(
    BottomNavigationItem(
        title = "List",
        selectedIcon = Icons.Filled.Home,
        unSelectedIcon = Icons.Outlined.Home,
        route = Navigation.List.name
    ),
    BottomNavigationItem(
        title = "Grid",
        selectedIcon = Icons.Filled.Info,
        unSelectedIcon = Icons.Outlined.Info,
        route = Navigation.Grid.name

    ),
    BottomNavigationItem(
        title = "About",
        selectedIcon = Icons.Filled.Person,
        unSelectedIcon = Icons.Outlined.Person,
        route = Navigation.About.name
    ),
)
