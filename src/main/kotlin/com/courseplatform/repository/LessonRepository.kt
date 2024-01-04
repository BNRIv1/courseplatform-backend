package com.courseplatform.repository

import com.courseplatform.domain.Lesson
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LessonRepository: JpaRepository<Lesson, Int> {

    fun findAllByCourseId(courseId: Int): List<Lesson>
}
