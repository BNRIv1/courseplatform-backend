package com.courseplatform.repository

import com.courseplatform.domain.views.CoursesDetailsView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CoursesDetailsViewRepository: JpaRepository<CoursesDetailsView, Long> {
}
