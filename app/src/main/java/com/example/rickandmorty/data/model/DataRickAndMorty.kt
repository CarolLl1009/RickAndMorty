package com.example.rickandmorty.data.model

@Parcelize
data class DataRickAndMorty(
    val info: @RawValue Info,
    val results: ArrayList<RickAndMorty>
)
