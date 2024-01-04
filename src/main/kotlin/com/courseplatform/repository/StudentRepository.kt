package com.courseplatform.repository

import com.courseplatform.domain.Student
import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: JpaRepository<Student, Long> {
    @Modifying
    @Query("insert into student values (:userId)", nativeQuery = true)
    fun addNewStudent(@Param("userId") userId: Int)

}
