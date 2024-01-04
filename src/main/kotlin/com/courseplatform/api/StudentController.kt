package com.courseplatform.api

import com.courseplatform.api.request.UserRequest
import com.courseplatform.service.StudentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/student")
@CrossOrigin
class StudentController(val studentService: StudentService) {

    @PostMapping
    fun addStudent(@RequestBody request: UserRequest) = studentService.addStudent(request)
}
