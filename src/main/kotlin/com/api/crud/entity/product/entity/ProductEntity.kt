package com.api.crud.entity.product.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.math.BigInteger

@Entity
@Table
data class ProductEntity(
    @Id @Column @GeneratedValue(strategy = GenerationType.AUTO) val id: BigInteger,
    @Column val name: String,
    @Column val price: BigDecimal,
    @Column val amount: Int
) {}