package com.example.ourshop.domain

import com.example.ourshop.data.remote.ProductDetailDto
import com.example.ourshop.data.remote.ProductsDto

interface ProductRepository {

    suspend fun getProducts(): List<ProductsDto>

    suspend fun getProductsDetail(id: String): ProductDetailDto
}