package com.example.amperfy.domain.models

import java.util.Date

data class Playlist(
    override val id: String,
    override val name: String,
    override val remoteStatus: Int,
    override val lastUpdate: Date,
    override val artwork: Artwork?,
    override val isFavorite: Boolean,
    val comment: String?,
    val owner: String?,
    val isShared: Boolean,
    val playables: List<AbstractPlayable>
) : AbstractLibraryEntity(id, name, remoteStatus, lastUpdate, artwork, isFavorite)
