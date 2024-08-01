package com.tpe.domain

import jakarta.persistence.*

@Entity
@Table(name ="t_user")
data class User(
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                val id: Long, //getter
                var name: String, //getter-setter
                var email:String //getter-setter
) {


    //constructor needed for JPA
    protected constructor() : this(0, "", "")


}