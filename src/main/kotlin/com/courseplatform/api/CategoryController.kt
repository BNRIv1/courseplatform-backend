package com.courseplatform.api

import com.courseplatform.repository.CategoryRepository
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/category")
@CrossOrigin
class CategoryController(val categoryRepository: CategoryRepository) {

    @GetMapping
    fun getCategories() = categoryRepository.findAll()
}
