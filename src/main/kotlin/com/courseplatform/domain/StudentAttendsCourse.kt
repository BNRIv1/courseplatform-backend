package com.courseplatform.domain

import jakarta.persistence.Column
import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "student_attends_course")
data class StudentAttendsCourse(

    @EmbeddedId
    val id: StudentAttendsCourseId,

    @Column(name = "date_enrolled")
    val dateEnrolled: LocalDate,

    @Column(name = "review", columnDefinition = "numeric")
    val review: Float?
)
