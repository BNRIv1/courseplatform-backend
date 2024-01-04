package com.courseplatform.domain

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "student")
class Student: User()
