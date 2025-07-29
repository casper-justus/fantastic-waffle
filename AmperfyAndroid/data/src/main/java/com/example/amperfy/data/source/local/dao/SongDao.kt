package com.example.amperfy.data.source.local.dao

import androidx.room.*
import com.example.amperfy.data.source.local.entity.SongEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SongDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(song: SongEntity)

    @Query("SELECT * FROM songs")
    fun getAll(): Flow<List<SongEntity>>

    @Query("SELECT * FROM songs WHERE id = :id")
    fun getById(id: String): Flow<SongEntity>
}
