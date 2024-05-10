package com.oppieramadhanti.frontendcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.oppieramadhanti.frontendcompose.ui.theme.FrontendComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrontendComposeTheme {
                MainScreen()
            }
        }
    }
}