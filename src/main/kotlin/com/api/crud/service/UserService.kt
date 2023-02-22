package com.api.crud.service

import com.api.crud.entity.UserEntity
import com.api.crud.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserService(var userRepository: UserRepository) {

    fun listAllUsers(): MutableList<UserEntity> {
        return userRepository.findAll();
    }
}