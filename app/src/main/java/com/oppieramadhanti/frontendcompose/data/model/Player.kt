package com.oppieramadhanti.frontendcompose.data.model

import java.io.Serializable

data class Player(
    val id: Int,
    val name: String,
    val birthDay: String,
    val position: String,
    val citizenship: String,
    val playerImage: Int = 0
) :Serializable