package com.example.recipesearchapp.models.recipe_details

data class Equipment(
        val id: Int,
        val image: String,
        val localizedName: String,
        val name: String,
        val temperature: Temperature
)
