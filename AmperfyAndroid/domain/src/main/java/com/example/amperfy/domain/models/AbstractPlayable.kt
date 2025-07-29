package com.example.amperfy.domain.models

import java.util.Date

abstract class AbstractPlayable(
    id: String,
    name: String,
    remoteStatus: Int,
    lastUpdate: Date,
    artwork: Artwork?,
    isFavorite: Boolean,
    open val duration: Int,
    open val track: Int?,
    open val playCount: Int,
    open val lastPlayed: Date?,
    open val bitRate: Int?,
    open val year: Int?,
    open val size: Int,
    open val contentType: String,
    open val relFilePath: String?,
    open val playContextType: Int,
) : AbstractLibraryEntity(id, name, remoteStatus, lastUpdate, artwork, isFavorite)
