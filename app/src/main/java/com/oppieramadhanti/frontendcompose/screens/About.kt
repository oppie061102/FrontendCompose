package com.oppieramadhanti.frontendcompose.screens


import com.oppieramadhanti.frontendcompose.R
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.*

import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment


import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "About Screen") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
        )
    }) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Card(
                modifier = Modifier.size(100.dp),
                shape = RectangleShape,

                ) {
                Image(
                    painter = painterResource(id = R.drawable.oppie_pic), contentDescription = null
                )
            }
            Text(
                text = "About Myself",
                fontSize = 30.sp,
                style = TextStyle(fontWeight = FontWeight.Bold)
            )
            Text(
                text = "Nama : Oppie Ramadhanti", fontSize = 25.sp
            )
            Text(
                text = "PT: Universitas Kuningan", fontSize = 25.sp
            )
            Text(
                text = "Email : oppieramadhanti@gmail.com", fontSize = 25.sp
            )
            Text(text = "Jurusan : Teknik Informatika", fontSize = 25.sp)
        }
    }
}


@Preview
@Composable
fun PreviewAboutScreen() {
    AboutScreen()
}