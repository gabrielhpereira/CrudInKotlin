package com.api.crud.entity.product.vo

import java.math.BigDecimal
import java.math.BigInteger

data class ProductVo(
    val id: BigInteger,
    val name: String,
    val price: BigDecimal,
    val amount: Int
) {}