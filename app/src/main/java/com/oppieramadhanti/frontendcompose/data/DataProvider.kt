package com.oppieramadhanti.frontendcompose.data

import com.oppieramadhanti.frontendcompose.R
import com.oppieramadhanti.frontendcompose.data.model.Player

object DataProvider {
    val player =
        Player(
            id = 1,
            name = "Kevin RM Hansen",
            position = "Goal Keeper",
            birthDay = "September 29, 1994",
            citizenship = "Filipina",
            playerImage = R.drawable.kevin_rm
        )


    val playerList = listOf(
        player,
        Player(
            id = 2,
            name = "Achmad Jufriyanto",
            birthDay = "Maret 06, 1987",
            position = "Defender",
            citizenship = "Indonesia",
            playerImage = R.drawable.achmad_jufry
        ),
        Player(
            id = 3,
            name = "Nick Kuipers",
            birthDay = "Oktober 07, 1992",
            position = "Defender",
            citizenship = "Belanda",
            playerImage = R.drawable.nick_kuipers
        ),
        Player(
            id = 4,
            name = "Dedi Kusnandar",
            birthDay = "Juli 22, 1991",
            position = "MidFielder",
            citizenship = "Indonesia",
            playerImage = R.drawable.dedi_kusnandar
        ),
        Player(
            id = 5,
            name = "Abdul Aziz Lutfi Akbar",
            birthDay = "Maret 13, 2019",
            position = "MidFielder",
            citizenship = "Indonesia",
            playerImage = R.drawable.abdul_aziz
        ),
        Player(
            id = 6,
            name = "Ezra Harm Ruud Walian",
            birthDay = "Oktober 21, 1997",
            position = "Striker",
            citizenship = "Indonesia",
            playerImage = R.drawable.ezra_harm
        ),
        Player(
            id = 7,
            name = "Zalnado",
            birthDay = "Desember 24, 1996",
            position = "Defender",
            citizenship = "Indonesia",
            playerImage = R.drawable.zalnado
        ),
        Player(
            id = 8,
            name = "Edo Febriansyah",
            birthDay = "Juli 25, 1997",
            position = "Defender",
            citizenship = "Indonesia",
            playerImage = R.drawable.edo_febry
        ),
        Player(
            id = 9,
            name = "Ryan Kurnia",
            birthDay = "Juni 28, 1996",
            position = "Defender",
            citizenship = "Indonesia",
            playerImage = R.drawable.ryan_kurnia
        ),
        Player(
            id = 10,
            name = "Fitrul Dwi Rustapa",
            birthDay = "Juni 04, 1995",
            position = "Goal Keeper",
            citizenship = "Indonesia",
            playerImage = R.drawable.fitrul_dwi
        ),
    )
}