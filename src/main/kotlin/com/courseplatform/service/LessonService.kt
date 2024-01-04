package com.courseplatform.service

import com.courseplatform.api.request.LessonRequest
import com.courseplatform.domain.Lesson
import com.courseplatform.repository.CourseRepository
import com.courseplatform.repository.LessonRepository
import org.springframework.stereotype.Service

@Service
class LessonService(
    val courseRepository: CourseRepository,
    val lessonRepository: LessonRepository
) {

    fun addCourse(request: LessonRequest) {
        with(request) {
            val course = courseRepository.findById(courseId).get()
            lessonRepository.save(Lesson(0, title, description, course))
        }
    }
}
