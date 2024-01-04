package com.courseplatform.domain

import jakarta.persistence.*

@Entity
@Table(name = "lesson")
data class Lesson(

    @Id
    @Column(name = "lesson_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "title")
    val title: String,

    @Column(name = "description")
    val description: String,

    @ManyToOne
    @JoinColumn(name = "course_id")
    val course: Course
)
