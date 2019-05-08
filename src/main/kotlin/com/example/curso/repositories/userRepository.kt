package com.example.curso.repositories

import com.example.curso.domains.entities.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface userRepository: CrudRepository<User,Int> {
    fun findByUsername(
            @Param("username") username: String
    ): User

    //@Query("""select * from usuarios""", nativeQuery = true)
   // fun findRepo:List<User>
}