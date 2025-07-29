package com.example.amperfy.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "artworks")
data class ArtworkEntity(
    @PrimaryKey val id: String,
    val type: String,
    val status: Int,
    val relFilePath: String?
)
