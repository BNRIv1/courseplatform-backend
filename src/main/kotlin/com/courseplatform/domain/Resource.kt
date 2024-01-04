package com.courseplatform.domain

import jakarta.persistence.*

@Entity
@Table(name = "resource")
data class Resource(
    @Id
    @Column(name = "resource_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "title")
    val title: String,

    @Column(name = "resource_path")
    val resourcePath: String,

    @ManyToOne
    @JoinColumn(name = "resource_type_id")
    val resourceType: ResourceType,

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    val lesson: Lesson
)
