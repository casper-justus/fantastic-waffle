package com.example.amperfy.data.source.local.dao

import androidx.room.*
import com.example.amperfy.data.source.local.entity.RadioEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RadioDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(radio: RadioEntity)

    @Query("SELECT * FROM radios")
    fun getAll(): Flow<List<RadioEntity>>

    @Query("SELECT * FROM radios WHERE id = :id")
    fun getById(id: String): Flow<RadioEntity>
}
