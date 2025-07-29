package com.example.amperfy.data.source.local.dao

import androidx.room.*
import com.example.amperfy.data.source.local.entity.PodcastEpisodeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PodcastEpisodeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(podcastEpisode: PodcastEpisodeEntity)

    @Query("SELECT * FROM podcast_episodes")
    fun getAll(): Flow<List<PodcastEpisodeEntity>>

    @Query("SELECT * FROM podcast_episodes WHERE id = :id")
    fun getById(id: String): Flow<PodcastEpisodeEntity>
}
