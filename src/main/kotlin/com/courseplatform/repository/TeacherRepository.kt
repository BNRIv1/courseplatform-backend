package com.courseplatform.repository

import com.courseplatform.domain.Teacher
import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface TeacherRepository: JpaRepository<Teacher, Int> {
    @Modifying
    @Query("insert into teacher values (:userId)", nativeQuery = true)
    fun addNewTeacher(@Param("userId") userId: Int)

}
