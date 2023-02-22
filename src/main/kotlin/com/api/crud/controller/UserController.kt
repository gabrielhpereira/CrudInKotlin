package com.api.crud.controller

import com.api.crud.entity.UserEntity
import com.api.crud.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(var userService: UserService) {

    @GetMapping("/listAllUsers")
    fun listAllUsers(): ResponseEntity<MutableList<UserEntity>> {
        return ResponseEntity.ok(userService.listAllUsers())
    }
}