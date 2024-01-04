package com.courseplatform.domain

import jakarta.persistence.*

@Entity
@Table(name = "resource_type")
data class ResourceType(

    @Id
    @Column(name = "resource_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "name")
    val name: String
)
