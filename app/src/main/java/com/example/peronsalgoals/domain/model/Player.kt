package com.example.peronsalgoals.domain.model

data class Player(
    val id: Long = 0L,
    val name: String,
    val tShirtNumber: Int,
    val rating: Int,
    val position: PositionType,
    val teamId: Long,
    val imageName: String
)