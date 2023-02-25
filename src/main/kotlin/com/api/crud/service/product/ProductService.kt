package com.api.crud.service.product

import com.api.crud.entity.product.ProductEntity
import com.api.crud.entity.product.dto.ProductDto
import com.api.crud.repository.product.ProductRepository
import org.springframework.stereotype.Service
import java.math.BigInteger

@Service
class ProductService(val productRepository: ProductRepository){

    fun listAllProducts():List<ProductEntity>{
        return this.productRepository.findAll()
    }

    fun saveProduct(productDto: ProductDto) {
        this.productRepository.save(ProductEntity(
            productDto.id,
            productDto.name,
            productDto.price,
            productDto.amount
        ))
    }

    fun deleteProduct(id: BigInteger){
        this.productRepository.deleteById(id)
    }
}