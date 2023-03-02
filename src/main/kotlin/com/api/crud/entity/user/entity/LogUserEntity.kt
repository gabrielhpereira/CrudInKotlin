package com.api.crud.entity.user.entity

import com.api.crud.entity.product.entity.ProductEntity
import jakarta.persistence.*
import org.apache.catalina.User
import java.util.*

data class LogUserEntity(
    @Id @Column @GeneratedValue(strategy = GenerationType.AUTO) val id: Int?,
    @Column val description: String?,
    @Column val data: Date?,
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_id") val user: UserEntity?
) {}