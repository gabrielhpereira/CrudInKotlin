package com.api.crud.entity.user.entity

import jakarta.persistence.*

@Entity
@Table
data class UserEntity(
    @Id @Column @GeneratedValue(strategy = GenerationType.AUTO) val id: Int,
    @Column val name: String?,
    @Column val email: String?
) {}