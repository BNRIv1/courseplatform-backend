package com.courseplatform.repository

import com.courseplatform.domain.views.CoursesLessonsView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CoursesLessonsViewRepository: JpaRepository<CoursesLessonsView, Int> {

    fun findByCourseTitleContainingIgnoreCase(title: String): List<CoursesLessonsView>

}
