package com.example.amperfy.data.source.local.dao

import androidx.room.*
import com.example.amperfy.data.source.local.entity.AlbumEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AlbumDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(album: AlbumEntity)

    @Query("SELECT * FROM albums")
    fun getAll(): Flow<List<AlbumEntity>>

    @Query("SELECT * FROM albums WHERE id = :id")
    fun getById(id: String): Flow<AlbumEntity>
}
