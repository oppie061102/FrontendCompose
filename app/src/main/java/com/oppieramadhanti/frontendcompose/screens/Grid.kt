package com.oppieramadhanti.frontendcompose.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.oppieramadhanti.frontendcompose.data.DataProvider
import com.oppieramadhanti.frontendcompose.data.model.Player

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GridScreen(navController: NavController) {
    val players = remember {
        DataProvider.playerList
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Grid Screen") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp),
            modifier = Modifier.padding(innerPadding)
        ) {
            items(players.size, itemContent = {
                PlayerImage(player = players[it]) {
                    navController.navigate("playerDetail/${players[it].id}")
                }
            })
        }

    }
}


@Composable
private fun PlayerImage(player: Player, onItemClick: () -> Unit) {
    Column(modifier = Modifier.clickable(onClick = onItemClick)) {
        Image(
            painter = painterResource(id = player.playerImage),
            contentDescription = player.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(20.dp)
                .size(150.dp)
                .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
        )
        Text(text = player.name)
    }

}