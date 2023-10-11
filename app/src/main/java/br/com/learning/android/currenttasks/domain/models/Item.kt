package br.com.learning.android.currenttasks.domain.models

import android.graphics.drawable.Drawable

data class Item(
    val title: String,
    val description: String,
    val image: Drawable?
)
