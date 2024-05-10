package com.oppieramadhanti.frontendcompose.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oppieramadhanti.frontendcompose.PlayerListItem
import com.oppieramadhanti.frontendcompose.data.DataProvider


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ListScreen() {
    val players = remember {
        DataProvider.playerList
    }
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(text = "List Screen")

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),

                )
        },
    ) { innerPadding ->

        Column {

            LazyRow(contentPadding = PaddingValues(16.dp), modifier = Modifier.padding(innerPadding)) {

                items(players.size, itemContent = {
                    PlayerListItem(player = players[it])
                })
            }

            LazyColumn(
                contentPadding = PaddingValues(16.dp), modifier = Modifier.padding(innerPadding)
            ) {
                items(players.size, itemContent = {
                    PlayerListItem(player = players[it])
                })
            }
        }
    }
}



