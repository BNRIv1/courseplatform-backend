package com.courseplatform.repository

import com.courseplatform.domain.StudentAttendsCourse
import com.courseplatform.domain.StudentAttendsCourseId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentAttendsCourseRepository: JpaRepository<StudentAttendsCourse, StudentAttendsCourseId> {
}
