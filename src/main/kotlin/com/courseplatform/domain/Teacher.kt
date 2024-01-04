package com.courseplatform.domain

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "teacher")
class Teacher: User()
