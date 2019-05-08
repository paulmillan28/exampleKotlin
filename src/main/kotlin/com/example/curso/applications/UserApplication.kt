package com.example.curso.applications

import com.example.curso.domains.entities.User
import com.example.curso.repositories.userRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserApplication(
        private val userRepository: userRepository
){
    fun getAll(): Iterable<User>{
        return this.userRepository.findAll()
    }
    fun getById(id:Int):User?{
        return this.userRepository.findByIdOrNull(id)
    }

    fun create(user:User):User{
        //validaciones

        val newUser= User()
        newUser.username = user.username
        newUser.password=user.password

        return this.userRepository.save(newUser)
    }

    fun modify(id:Int,user:User):User{
        val sUser =  this.userRepository.findByIdOrNull(id)
        //validaciones no debe ser nulo lo que devuelve

        sUser!!.username=user.username
        return this.userRepository.save(sUser)
    }

    fun delete(id:Int):String{
        this.userRepository.deleteById(id)
        return "Se borró"
    }
}