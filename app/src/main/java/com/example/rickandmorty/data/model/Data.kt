package com.example.rickandmorty.data.model

import android.os.Parcelable
@Parcelize
data class Data(
    val name: String,
    val url: String
) : Parcelable

