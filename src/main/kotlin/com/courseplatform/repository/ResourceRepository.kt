package com.courseplatform.repository

import com.courseplatform.domain.Resource
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ResourceRepository: JpaRepository<Resource, Int> {

    fun getAllByLessonId(lessonId: Int): List<Resource>
}
