package com.courseplatform.service

import com.courseplatform.api.request.CourseRequest
import com.courseplatform.domain.Course
import com.courseplatform.repository.CategoryRepository
import com.courseplatform.repository.CourseRepository
import com.courseplatform.repository.TeacherRepository
import org.springframework.stereotype.Service

@Service
class CourseService(val courseRepository: CourseRepository,
    val teacherRepository: TeacherRepository,
    val categoryRepository: CategoryRepository) {

    fun addCourse(request: CourseRequest){
        with(request){
            val teacher = teacherRepository.findById(teacherId).get()
            val category = categoryRepository.findById(categoryId).get()
            courseRepository.save(Course(0, title, description, dateCreated, teacher, category))
        }
    }

}
