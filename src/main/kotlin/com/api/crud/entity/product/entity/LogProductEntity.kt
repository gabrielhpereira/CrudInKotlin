package com.api.crud.entity.product.entity

import jakarta.persistence.*
import java.util.Date

data class LogProductEntity(
    @Id @Column @GeneratedValue(strategy = GenerationType.AUTO) val id: Int?,
    @Column val description: String?,
    @Column val data: Date?,
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "product_id") val product: ProductEntity?
) {}