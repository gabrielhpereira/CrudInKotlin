package com.api.crud.repository.product

import com.api.crud.entity.product.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface ProductRepository : JpaRepository<ProductEntity, BigInteger>{

}