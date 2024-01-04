package com.courseplatform.service

import com.courseplatform.api.request.UserRequest
import com.courseplatform.domain.Teacher
import com.courseplatform.domain.User
import com.courseplatform.repository.TeacherRepository
import com.courseplatform.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class TeacherService(
    val teacherRepository: TeacherRepository,
    val userRepository: UserRepository
) {

    fun addTeacher(request: UserRequest) = with(request){
        val user = userRepository.save(User(0, firstName, lastName, email, username, password))
        teacherRepository.addNewTeacher(user.id)
    }
}
