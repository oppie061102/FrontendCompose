package com.oppieramadhanti.frontendcompose.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.oppieramadhanti.frontendcompose.data.model.Player

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(player: Player,) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Detail Screen") },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        },
    ) {
        Column {
            // Display player details here
            Text(text = "Name: ${player.name}")
            Text(text = "Position: ${player.position}")
            Text(text = "Birth Day: ${player.birthDay}")
            Text(text = "Citizenship: ${player.citizenship}")
        }
    }
}
