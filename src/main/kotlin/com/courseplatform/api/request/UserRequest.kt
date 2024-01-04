package com.courseplatform.api.request

data class UserRequest(
    val firstName: String,
    val lastName: String,
    val username: String,
    val password: String,
    val email: String
)
