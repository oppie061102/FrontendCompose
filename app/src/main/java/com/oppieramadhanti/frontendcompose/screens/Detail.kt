package com.oppieramadhanti.frontendcompose.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.oppieramadhanti.frontendcompose.data.model.Player


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DetailScreen(player: Player, navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Detail Screen") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        },
    ) {innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Card {
                Image(painter = painterResource(id = player.playerImage), contentDescription = "Picture of ${player.name}")
            }
            Spacer(modifier = Modifier.size(30.dp))
            // Display player details here
            Text(text = "Name: ${player.name}")
            Text(text = "Position: ${player.position}")
            Text(text = "Birth Day: ${player.birthDay}")
            Text(text = "Citizenship: ${player.citizenship}")
        }
    }
}
