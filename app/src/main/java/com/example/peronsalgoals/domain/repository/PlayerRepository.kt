package com.example.peronsalgoals.domain.repository

import com.example.peronsalgoals.domain.model.Player
import kotlinx.coroutines.flow.Flow

interface PlayerRepository {
    fun fetch(playerId: Long): Flow<Player>
    fun fetchAll(teamId: Long): Flow<List<Player>>
    suspend fun delete(playerId: Long)
    suspend fun upsert(player: Player)
}