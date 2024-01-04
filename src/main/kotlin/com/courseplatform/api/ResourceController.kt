package com.courseplatform.api

import com.courseplatform.api.request.ResourceRequest
import com.courseplatform.repository.ResourceRepository
import com.courseplatform.service.ResourceService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/resource")
@CrossOrigin
class ResourceController (val repository: ResourceRepository, val resourceService: ResourceService) {

    @GetMapping("/{lessonId}")
    fun findResourcesByLessonId(@PathVariable lessonId: Int) = repository.getAllByLessonId(lessonId)

    @PostMapping
    fun addResource(@RequestBody request: ResourceRequest) = resourceService.addResource(request)
}
