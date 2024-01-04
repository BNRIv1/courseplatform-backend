package com.courseplatform.domain

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
data class StudentAttendsCourseId(
    val studentId: Int,
    val courseId: Int
): Serializable
