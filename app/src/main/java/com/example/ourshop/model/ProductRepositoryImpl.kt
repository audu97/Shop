package com.example.ourshop.model

import com.example.ourshop.common.ShopApi
import com.example.ourshop.data.remote.ProductDetailDto
import com.example.ourshop.data.remote.ProductsDto
import com.example.ourshop.domain.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(private val api: ShopApi) : ProductRepository {
    override suspend fun getProducts(): List<ProductsDto> {
        return api.getProducts()
    }

    override suspend fun getProductsDetail(id: String): ProductDetailDto {
        return api.getProductDetail(id)
    }
}