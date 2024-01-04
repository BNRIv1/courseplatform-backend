package com.courseplatform.api

import com.courseplatform.api.request.ResourceRequest
import com.courseplatform.repository.ResourceTypeRepository
import com.courseplatform.service.ResourceService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/resource-type")
@CrossOrigin
class ResourceTypeController(val resourceTypeRepository: ResourceTypeRepository) {

    @GetMapping
    fun getAllResourceTypes() = resourceTypeRepository.findAll()

}
