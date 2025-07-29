package com.example.amperfy.domain.models

import java.util.Date

data class Song(
    override val id: String,
    override val name: String,
    override val remoteStatus: Int,
    override val lastUpdate: Date,
    override val artwork: Artwork?,
    override val isFavorite: Boolean,
    override val duration: Int,
    override val track: Int?,
    override val playCount: Int,
    override val lastPlayed: Date?,
    override val bitRate: Int?,
    override val year: Int?,
    override val size: Int,
    override val contentType: String,
    override val relFilePath: String?,
    override val playContextType: Int,
    val artist: Artist?,
    val album: Album?,
    val albumName: String?
) : AbstractPlayable(
    id,
    name,
    remoteStatus,
    lastUpdate,
    artwork,
    isFavorite,
    duration,
    track,
    playCount,
    lastPlayed,
    bitRate,
    year,
    size,
    contentType,
    relFilePath,
    playContextType
)
