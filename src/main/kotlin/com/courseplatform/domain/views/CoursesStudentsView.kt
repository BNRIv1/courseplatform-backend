package com.courseplatform.domain.views

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable

@Entity
@Immutable
@Table(name = "courses_students")
data class CoursesStudentsView(
    @Id
    @Column(name = "id")
    val id: Long,

    @Column(name = "course_title")
    val courseTitle: String,

    @Column(name =  "student_first_name")
    val studentFirstName: String,

    @Column(name = "student_last_name")
    val studentLastName: String
)
