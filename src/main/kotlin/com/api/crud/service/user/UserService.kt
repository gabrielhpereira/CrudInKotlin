package com.api.crud.service.user

import com.api.crud.entity.user.UserEntity
import com.api.crud.entity.user.dto.UserDto
import com.api.crud.repository.user.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(var userRepository: UserRepository) {

    fun listAllUsers(): MutableList<UserEntity> { return userRepository.findAll() }

    fun saveUser(userDto: UserDto) {
        this.userRepository.save(UserEntity(
            userDto.id,
            userDto.name,
            userDto.email
        ))
    }

    fun deleteUser(id: Int){ this.userRepository.deleteById(id) }
}