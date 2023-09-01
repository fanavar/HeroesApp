package cl.awakelab.heroesapp.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface HeroeApi{
    @GET("superheroes/")
    suspend fun getData(): Response<List<Heroe>>
}