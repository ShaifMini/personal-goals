package com.example.peronsalgoals.domain.repository

import com.example.peronsalgoals.domain.model.Team
import kotlinx.coroutines.flow.Flow

interface TeamRepository {
    fun fetch(teamId: Long): Flow<Team>
    fun fetchAll(): Flow<List<Team>>
    suspend fun upsert(team: Team)
}