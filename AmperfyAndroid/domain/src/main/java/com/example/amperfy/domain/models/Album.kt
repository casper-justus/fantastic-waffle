package com.example.amperfy.domain.models

import java.util.Date

data class Album(
    override val id: String,
    override val name: String,
    override val remoteStatus: Int,
    override val lastUpdate: Date,
    override val artwork: Artwork?,
    override val isFavorite: Boolean,
    val artist: Artist?,
    val year: Int?,
    val isSongsMetaDataSynced: Boolean,
    val songs: List<Song>
) : AbstractLibraryEntity(id, name, remoteStatus, lastUpdate, artwork, isFavorite)
