package com.api.crud.controller.user

import com.api.crud.entity.user.UserEntity
import com.api.crud.entity.user.dto.UserDto
import com.api.crud.entity.user.vo.UserVo
import com.api.crud.service.user.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(val userService: UserService) {

    @PostMapping("listUsersByFilters")
    fun listUsersByFilters(@RequestBody userDto: UserDto): ResponseEntity<List<UserVo>> =
        ResponseEntity.ok(this.userService.listUsersByFilters(userDto))

    @GetMapping("/listAllUsers")
    fun listAllUsers(): ResponseEntity<MutableList<UserEntity>> = ResponseEntity.ok(userService.listAllUsers())

    @PostMapping("/saveUser")
    fun saveUser(@RequestBody userDto: UserDto): ResponseEntity<UserEntity> = ResponseEntity.ok(userService.saveUser(userDto))

    @DeleteMapping("/deleteUser/{id}")
    fun deleteUser(@PathVariable id: Int): ResponseEntity<out Any> = ResponseEntity.ok(userService.deleteUser(id))
}