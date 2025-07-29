package com.example.amperfy.domain.models

import java.util.Date

abstract class AbstractLibraryEntity(
    open val id: String,
    open val name: String,
    open val remoteStatus: Int,
    open val lastUpdate: Date,
    open val artwork: Artwork?,
    open val isFavorite: Boolean
)
