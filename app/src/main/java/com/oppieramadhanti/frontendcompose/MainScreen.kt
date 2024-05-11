package com.oppieramadhanti.frontendcompose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.oppieramadhanti.frontendcompose.data.DataProvider
import com.oppieramadhanti.frontendcompose.screens.AboutScreen
import com.oppieramadhanti.frontendcompose.screens.DetailScreen
import com.oppieramadhanti.frontendcompose.screens.GridScreen
import com.oppieramadhanti.frontendcompose.screens.ListScreen


@Composable
fun MainScreen() {
    var selected by remember {
        mutableIntStateOf(0)
    }
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                listOfNavItems.forEachIndexed { index, bottomNavigationItem ->
                    NavigationBarItem(
                        selected = index == selected,
                        onClick = {
                            selected = index
                            navController.navigate(
                                bottomNavigationItem.route
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = if (index == selected)
                                    bottomNavigationItem.selectedIcon
                                else
                                    bottomNavigationItem.unSelectedIcon,
                                contentDescription = bottomNavigationItem.title

                            )
                        },
                        label = {
                            Text(text = bottomNavigationItem.title)
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Navigation.List.name,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = Navigation.List.name, content = { ListScreen(navController) })
            composable(route = Navigation.Grid.name, content = { GridScreen(navController) })
            composable(route = Navigation.About.name, content = { AboutScreen() })
            composable(
                route = "playerDetail/{playerId}",
                arguments = listOf(navArgument("playerId") { type = NavType.IntType }) // Define player ID argument
            ) { backStackEntry ->
                val playerId = backStackEntry.arguments?.getInt("playerId") //moving to detail screen with passing data from previous screen
                val player = playerId?.let { id ->
                    DataProvider.playerList.find { it.id == id }
                }
                player?.let { DetailScreen(player = it, navController = navController) }
            }
        }
    }
}