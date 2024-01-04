package com.courseplatform.domain

import jakarta.persistence.*

@Entity
@Table(name = "category")
data class Category(
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "title")
    val title: String,

    @JoinColumn(name = "parent_category_id")
    @ManyToOne
    val parentCategory: Category?
)
