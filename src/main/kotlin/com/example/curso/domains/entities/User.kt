package com.example.curso.domains.entities

import com.fasterxml.jackson.annotation.JsonFormat
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import java.util.*
import javax.persistence.*

@Entity
@Table(name="usuarios")
@DynamicInsert
@DynamicUpdate
class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int ?= null
    var username: String ?= null
    var password: String ?= null

    @Column(name = "created_at")
    @JsonFormat(pattern = "dd/MM/yyyy", timezone = "America/Mazatlan")
    var fechaCreacion : Date?=null
}