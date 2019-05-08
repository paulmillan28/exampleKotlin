package com.example.curso.controllers

import com.example.curso.applications.UserApplication
import com.example.curso.domains.entities.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/users")
class userController(
        private val userApplication: UserApplication
){
    @GetMapping
    fun getAll(): Iterable<User>{
        return this.userApplication.getAll()
    }

    @GetMapping("{id}")
    fun getById(@PathVariable id:Int):User?{
        return this.userApplication.getById(id)
    }

    @PostMapping
    fun create(@RequestBody user: User):User{
        return this.userApplication.create(user)
    }

    @PutMapping("{id}")
    fun modify(@PathVariable id:Int, @RequestBody user:User):User{
        return this.userApplication.modify(id, user)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id:Int):String{
        return this.userApplication.delete(id)
    }



}