package com.api.crud.service.product

import com.api.crud.entity.product.entity.ProductEntity
import com.api.crud.entity.product.dto.ProductDto
import com.api.crud.entity.product.vo.ProductVo
import com.api.crud.repository.product.ProductRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.math.BigInteger

@Service
class ProductService(val productRepository: ProductRepository) {

    private fun checkStringEmpty(valor: String) = valor.isEmpty()

    fun listAllProducts(): List<ProductVo> = this.productRepository.listAllProducts()

    fun listProductsByFilters(productDto: ProductDto): List<ProductVo> =
        this.productRepository.listProductsByFilters(
            productDto.id,
            if (checkStringEmpty(productDto.name)) null else "%" + productDto.name.uppercase().trim() + "%",
            if (productDto.price < BigDecimal.ZERO) null else productDto.price,
            if (productDto.amount < 0) null else productDto.amount
        )

    fun saveProduct(productDto: ProductDto) =
        this.productRepository.save(
            ProductEntity(
                productDto.id,
                productDto.name,
                productDto.price,
                productDto.amount
            )
        )

    fun deleteProduct(id: BigInteger) = this.productRepository.deleteById(id)
}