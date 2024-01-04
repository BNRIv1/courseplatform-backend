package com.courseplatform.domain

import jakarta.persistence.*

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
open class User(
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Int = 0,

    @Column(name = "first_name")
    open var firstName: String = "",

    @Column(name = "last_name")
    open var lastName: String = "",

    @Column(name = "email")
    open var email: String = "",

    @Column(name = "username")
    open var username: String = "",

    @Column(name = "password")
    open var password: String = ""
)
