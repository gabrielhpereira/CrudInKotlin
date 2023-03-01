package com.api.crud.repository.product

import com.api.crud.entity.product.entity.ProductEntity
import com.api.crud.entity.product.vo.ProductVo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.math.BigDecimal
import java.math.BigInteger

@Repository
interface ProductRepository : JpaRepository<ProductEntity, BigInteger> {

    @Query("SELECT new com.api.crud.entity.product.vo.ProductVo(p.id, p.name, p.price, p.amount)"
                + "     FROM ProductEntity p")
    fun listAllProducts(): List<ProductVo>

    @Query("SELECT new com.api.crud.entity.product.vo.ProductVo(p.id, p.name, p.price, p.amount)"
                + " FROM ProductEntity p"
                + " WHERE :id = 0 OR p.id = :id"
                + "  AND :name IS NULL OR p.name LIKE :name"
                + "  AND :price IS NULL OR p.price = :price"
                + "  AND :amount IS NULL OR p.amount = :amount")
    fun listProductsByFilters(
        @Param("id") id: BigInteger,
        @Param("name") name: String?,
        @Param("price") price: BigDecimal?,
        @Param("amount") amount: Int?
    ): List<ProductVo>
}