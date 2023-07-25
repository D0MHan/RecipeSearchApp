package com.example.recipesearchapp.models.recipe_details

data class AnalyzedInstruction(
        val name: String,
        val steps: List<Step>
)
