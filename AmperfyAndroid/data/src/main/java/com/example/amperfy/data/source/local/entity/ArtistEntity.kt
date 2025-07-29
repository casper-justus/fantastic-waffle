package com.example.amperfy.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "artists")
data class ArtistEntity(
    @PrimaryKey val id: String,
    val name: String,
    val remoteStatus: Int,
    val lastUpdate: Date,
    val artworkId: String?,
    val isFavorite: Boolean
)
