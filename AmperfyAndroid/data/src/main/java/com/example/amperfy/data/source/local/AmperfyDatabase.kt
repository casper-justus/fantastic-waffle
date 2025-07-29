package com.example.amperfy.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.amperfy.data.source.local.dao.*
import com.example.amperfy.data.source.local.entity.*

@Database(
    entities = [
        AlbumEntity::class,
        ArtistEntity::class,
        ArtworkEntity::class,
        SongEntity::class,
        PlaylistEntity::class,
        PodcastEntity::class,
        PodcastEpisodeEntity::class,
        RadioEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AmperfyDatabase : RoomDatabase() {
    abstract fun albumDao(): AlbumDao
    abstract fun artistDao(): ArtistDao
    abstract fun artworkDao(): ArtworkDao
    abstract fun songDao(): SongDao
    abstract fun playlistDao(): PlaylistDao
    abstract fun podcastDao(): PodcastDao
    abstract fun podcastEpisodeDao(): PodcastEpisodeDao
    abstract fun radioDao(): RadioDao
}
