package com.api.crud.repository.product

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LogProductRepository : JpaRepository<LogProductRepository, Int>{
}