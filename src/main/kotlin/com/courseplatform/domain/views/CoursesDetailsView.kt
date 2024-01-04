package com.courseplatform.domain.views

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable

@Entity
@Immutable
@Table(name = "courses_details")
data class CoursesDetailsView(
    @Id
    @Column(name = "id")
    val id: Long,

    @Column(name = "course_title")
    val title: String,

    @Column(name = "description")
    val description: String,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String,

    @Column(name = "category")
    val category: String,

    @Column(name = "review", columnDefinition = "FLOAT")
    val review: Float?
)
