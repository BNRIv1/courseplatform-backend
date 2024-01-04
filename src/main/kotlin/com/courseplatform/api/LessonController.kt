package com.courseplatform.api

import com.courseplatform.api.request.LessonRequest
import com.courseplatform.repository.LessonRepository
import com.courseplatform.service.LessonService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/lesson")
@CrossOrigin
class LessonController(val lessonRepository: LessonRepository, val lessonService: LessonService) {

    @GetMapping("/{courseId}")
    fun getLessonsByCourse(@PathVariable courseId: Int) = lessonRepository.findAllByCourseId(courseId)

    @PostMapping
    fun addLesson(@RequestBody request: LessonRequest) = lessonService.addCourse(request)
}
