package com.courseplatform.api.request

data class LessonRequest(
    val title: String,
    val description: String,
    val courseId: Int
)
