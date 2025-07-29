package com.example.amperfy.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "podcast_episodes")
data class PodcastEpisodeEntity(
    @PrimaryKey val id: String,
    val name: String,
    val remoteStatus: Int,
    val lastUpdate: Date,
    val artworkId: String?,
    val isFavorite: Boolean,
    val duration: Int,
    val track: Int?,
    val playCount: Int,
    val lastPlayed: Date?,
    val bitRate: Int?,
    val year: Int?,
    val size: Int,
    val contentType: String,
    val relFilePath: String?,
    val playContextType: Int,
    val podcastId: String?,
    val streamUrl: String?,
    val description: String?,
    val publishedDate: Date?
)
