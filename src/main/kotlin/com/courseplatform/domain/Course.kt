package com.courseplatform.domain

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "course")
data class Course(
    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "title")
    val title: String,

    @Column(name = "description")
    val description: String,

    @Column(name = "date_created")
    val dateCreated: LocalDate,

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    val teacher: Teacher,

    @ManyToOne
    @JoinColumn(name = "category_id")
    val category: Category
)
