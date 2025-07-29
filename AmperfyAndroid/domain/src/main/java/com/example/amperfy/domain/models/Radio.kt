package com.example.amperfy.domain.models

import java.util.Date

data class Radio(
    override val id: String,
    override val name: String,
    override val remoteStatus: Int,
    override val lastUpdate: Date,
    override val artwork: Artwork?,
    override val isFavorite: Boolean,
    val streamUrl: String
) : AbstractLibraryEntity(id, name, remoteStatus, lastUpdate, artwork, isFavorite)
