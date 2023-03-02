package com.api.crud.repository.user

import com.api.crud.entity.user.entity.LogUserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LogUserRepository : JpaRepository<LogUserEntity, Int> {
}