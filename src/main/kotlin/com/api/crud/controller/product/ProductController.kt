package com.api.crud.controller.product

import com.api.crud.entity.product.entity.ProductEntity
import com.api.crud.entity.product.dto.ProductDto
import com.api.crud.entity.product.vo.ProductVo
import com.api.crud.service.product.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
@RequestMapping("/product")
class ProductController(val productService: ProductService) {

    @PostMapping("/listProductsByFilters")
    fun listUsersByFilters(@RequestBody productDto: ProductDto): ResponseEntity<List<ProductVo>> =
        ResponseEntity.ok(this.productService.listProductsByFilters(productDto))

    @GetMapping("/listAllProducts")
    fun listAllUsers(): ResponseEntity<List<ProductVo>> = ResponseEntity.ok(this.productService.listAllProducts())

    @PostMapping("/saveProduct")
    fun saveProduct(@RequestBody productDto: ProductDto): ResponseEntity<ProductEntity> =
        ResponseEntity.ok(this.productService.saveProduct(productDto))

    @DeleteMapping("deleteProduct/{id}")
    fun deleteProduct(@PathVariable id: BigInteger): ResponseEntity<Unit> =
        ResponseEntity.ok(this.productService.deleteProduct(id))
}