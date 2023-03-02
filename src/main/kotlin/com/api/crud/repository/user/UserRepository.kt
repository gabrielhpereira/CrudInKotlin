package com.api.crud.repository.user

import com.api.crud.entity.user.entity.UserEntity
import com.api.crud.entity.user.vo.UserVo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserEntity, Int> {

    @Query("SELECT new com.api.crud.entity.user.vo.UserVo(u.id, u.name, u.email)"
                + "     FROM UserEntity u"
                + " WHERE :id = 0 OR u.id = :id"
                + "     AND :name IS NULL OR u.name LIKE :name"
                + "     AND :email IS NULL OR u.email LIKE :email")
    fun listUsersByFilters(
        @Param("id") id: Int,
        @Param("name") name: String?,
        @Param("email") email: String?
    ): List<UserVo>
}