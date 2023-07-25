package com.example.recipesearchapp.api

import com.example.recipesearchapp.models.RecipiesByIngredientsReponse
import com.example.recipesearchapp.models.recipe_details.RecipeDetailsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface RecipesApi {
    @GET("recipes/findByIngredients")
    suspend fun getRecipesByIngredients(
        @Query("ingredients")
        query: String,
        @Query("apiKey")
        apiKey: String) : Response<RecipiesByIngredientsReponse>

    @GET("recipes/{id}/information")
    suspend fun getRecipeInformation(
        @Path("id")
        id: Int,
        @Query("apiKey")
        apiKey: String) : Response<RecipeDetailsResponse>
}