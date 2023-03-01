package com.api.crud.entity.product.entity

import java.util.Date

data class LogProductEntity(
    val id: Int?,
    val description: String?,
    val data: Date?,
    val product: ProductEntity?
){ }