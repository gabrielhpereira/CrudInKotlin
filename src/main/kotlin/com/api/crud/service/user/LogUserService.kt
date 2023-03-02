package com.api.crud.service.user

import com.api.crud.repository.user.LogUserRepository
import org.springframework.stereotype.Service

@Service
class LogUserService(val logUserRepository: LogUserRepository) {

    fun listAllLogUser(userId:Int) = this.logUserRepository.findAll()
}