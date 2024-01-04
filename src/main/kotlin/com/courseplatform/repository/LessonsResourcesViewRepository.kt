package com.courseplatform.repository

import com.courseplatform.domain.views.LessonsResourcesView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LessonsResourcesViewRepository: JpaRepository<LessonsResourcesView, Long> {
}
