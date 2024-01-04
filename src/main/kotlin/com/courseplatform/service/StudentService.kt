package com.courseplatform.service

import com.courseplatform.api.request.UserRequest
import com.courseplatform.domain.Student
import com.courseplatform.domain.Teacher
import com.courseplatform.domain.User
import com.courseplatform.repository.StudentRepository
import com.courseplatform.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    val studentRepository: StudentRepository,
    val userRepository: UserRepository
) {

    fun addStudent(request: UserRequest) = with(request){
        val user = userRepository.save(User(0, firstName, lastName, email, username, password))
        studentRepository.addNewStudent(user.id)
    }

}
