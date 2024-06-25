package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nameRes: Int,
    val PopularityRes: Int,
    @DrawableRes val ImageRes: Int
)
