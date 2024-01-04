package com.courseplatform.repository

import com.courseplatform.domain.views.CoursesStudentsView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CoursesStudentsViewRepository: JpaRepository<CoursesStudentsView, Int> {
}
