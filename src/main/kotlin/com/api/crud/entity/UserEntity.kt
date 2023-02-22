package com.api.crud.entity

import jakarta.persistence.*

@Entity
@Table
data class UserEntity(

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int,

    @Column
    var name: String,

    @Column
    var email: String
) {
}