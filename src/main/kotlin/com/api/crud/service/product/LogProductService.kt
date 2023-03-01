package com.api.crud.service.product

import com.api.crud.entity.product.entity.LogProductEntity
import com.api.crud.repository.product.LogProductRepository
import org.springframework.stereotype.Service
import java.math.BigInteger

@Service
class LogProductService(val logProductRepository: LogProductRepository) {

    fun listAllLogProduct(idProduct: BigInteger) = this.logProductRepository.findAll()
}