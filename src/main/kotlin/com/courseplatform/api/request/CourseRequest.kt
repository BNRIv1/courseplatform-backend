package com.courseplatform.api.request

import java.time.LocalDate

data class CourseRequest(
    val title: String,
    val description: String,
    val dateCreated: LocalDate,
    val categoryId: Int,
    val teacherId: Int
)
