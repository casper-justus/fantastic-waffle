package com.example.amperfy.data.source.local.dao

import androidx.room.*
import com.example.amperfy.data.source.local.entity.PodcastEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PodcastDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(podcast: PodcastEntity)

    @Query("SELECT * FROM podcasts")
    fun getAll(): Flow<List<PodcastEntity>>

    @Query("SELECT * FROM podcasts WHERE id = :id")
    fun getById(id: String): Flow<PodcastEntity>
}
