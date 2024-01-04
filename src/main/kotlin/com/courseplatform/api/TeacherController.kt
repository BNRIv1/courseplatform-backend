package com.courseplatform.api

import com.courseplatform.api.request.UserRequest
import com.courseplatform.repository.TeacherRepository
import com.courseplatform.service.TeacherService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/teacher")
@CrossOrigin
class TeacherController(val teacherRepository: TeacherRepository,
    val teacherService: TeacherService) {
    @GetMapping
    fun getTeachers() = teacherRepository.findAll()

    @PostMapping
    fun addTeacher(@RequestBody request: UserRequest) = teacherService.addTeacher(request)
}
