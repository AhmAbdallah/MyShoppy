package com.example.myshoppy

import retrofit2.Response
import retrofit2.http.GET

interface ProductService {
    @GET("products")
    suspend fun getAllProducts(): Response<List<Any>>
}