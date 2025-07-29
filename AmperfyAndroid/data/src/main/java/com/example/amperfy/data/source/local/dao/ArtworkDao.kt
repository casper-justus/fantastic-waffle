package com.example.amperfy.data.source.local.dao

import androidx.room.*
import com.example.amperfy.data.source.local.entity.ArtworkEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ArtworkDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(artwork: ArtworkEntity)

    @Query("SELECT * FROM artworks")
    fun getAll(): Flow<List<ArtworkEntity>>

    @Query("SELECT * FROM artworks WHERE id = :id")
    fun getById(id: String): Flow<ArtworkEntity>
}
