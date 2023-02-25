package com.api.crud.service.user

import com.api.crud.entity.user.UserEntity
import com.api.crud.entity.user.dto.UserDto
import com.api.crud.entity.user.vo.UserVo
import com.api.crud.repository.user.UserRepository
import org.apache.catalina.User
import org.springframework.stereotype.Service

@Service
class UserService(var userRepository: UserRepository) {

    fun checkStringEmpty(valor: String) = valor.isEmpty()

    fun listUsersByFilters(userDto: UserDto) : List<UserVo> {
        return this.userRepository.listUsersByFilters(
            userDto.id,
            if (checkStringEmpty(userDto.name)) null else "%" + userDto.name.uppercase().trim() + "%",
            if (checkStringEmpty(userDto.email)) null else "%" + userDto.email.trim() + "%"
        )
    }

    fun listAllUsers(): MutableList<UserEntity> { return this.userRepository.findAll() }

    fun saveUser(userDto: UserDto) {
        this.userRepository.save(UserEntity(
            userDto.id,
            userDto.name,
            userDto.email
        ))
    }

    fun deleteUser(id: Int){ this.userRepository.deleteById(id) }
}