package com.courseplatform.api

import com.courseplatform.api.request.CourseRequest
import com.courseplatform.repository.CoursesDetailsViewRepository
import com.courseplatform.service.CourseService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/course")
@CrossOrigin
class CourseController(val coursesDetailsViewRepository: CoursesDetailsViewRepository,
    val courseService: CourseService) {

    @GetMapping
    fun getCourses() = coursesDetailsViewRepository.findAll()

    @PostMapping
    fun addCourse(@RequestBody request: CourseRequest) = courseService.addCourse(request)


}
