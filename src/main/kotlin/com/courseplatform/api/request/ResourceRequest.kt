package com.courseplatform.api.request

data class ResourceRequest(
    val title: String,
    val resourcePath: String,
    val lessonId: Int,
    val resourceTypeId: Int
)
