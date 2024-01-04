package com.courseplatform.domain.views

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable

@Entity
@Table(name = "lessons_resources")
@Immutable
data class LessonsResourcesView(
    @Id
    @Column(name = "id")
    val id: Long,

    @Column(name = "lesson_title")
    val lesson: String,

    @Column(name = "resource_path")
    val resourcePath: String
)
