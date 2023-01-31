package com.example.ourshop.common

import com.example.ourshop.data.remote.ProductDetailDto
import com.example.ourshop.data.remote.ProductsDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ShopApi {

    @GET("products")
    suspend fun getProducts() :List<ProductsDto>

    @GET("products/{id}")
    suspend fun getProductDetail(@Path("id") id: String): ProductDetailDto
}