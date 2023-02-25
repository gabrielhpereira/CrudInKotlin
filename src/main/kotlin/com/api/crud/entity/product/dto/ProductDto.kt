package com.api.crud.entity.product.dto

import java.math.BigDecimal
import java.math.BigInteger

data class ProductDto(
    val id: BigInteger,
    val name: String,
    val price: BigDecimal,
    val amount: Int
) {
}