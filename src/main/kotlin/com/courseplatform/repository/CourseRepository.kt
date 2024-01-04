package com.courseplatform.repository

import com.courseplatform.domain.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CourseRepository: JpaRepository<Course, Int> {
}
