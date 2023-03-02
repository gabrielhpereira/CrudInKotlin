package com.api.crud.repository.product

import com.api.crud.entity.product.entity.LogProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LogProductRepository : JpaRepository<LogProductEntity, Int> {
}