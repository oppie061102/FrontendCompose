package com.oppieramadhanti.frontendcompose.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues

import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import com.oppieramadhanti.frontendcompose.PlayerListItem
import com.oppieramadhanti.frontendcompose.data.DataProvider


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ListScreen(navController: NavController) {
    val players = remember { DataProvider.playerList }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "List Screen") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { innerPadding ->

        Column {

            LazyRow(
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier.padding(innerPadding)
            ) {

                items(players.size, itemContent = {
                    PlayerListItem(player = players[it]) {
                        navController.navigate("playerDetail/${players[it].id}")
                    }
                })
            }

            LazyColumn(contentPadding = PaddingValues(16.dp)) {
                items(players.size) { index ->
                    val player = players[index]
                    PlayerListItem(player = player) {
                        navController.navigate("playerDetail/${player.id}")
                    }
                }
            }
        }
    }
}



