package com.courseplatform.service

import com.courseplatform.api.request.ResourceRequest
import com.courseplatform.domain.Resource
import com.courseplatform.repository.LessonRepository
import com.courseplatform.repository.ResourceRepository
import com.courseplatform.repository.ResourceTypeRepository
import org.springframework.stereotype.Service

@Service
class ResourceService(val resourceRepository: ResourceRepository, val resourceTypeRepository: ResourceTypeRepository,
    val lessonRepository: LessonRepository) {

    fun addResource(request: ResourceRequest){
        with(request){
            val resourceType = resourceTypeRepository.findById(resourceTypeId).get()
            val lesson = lessonRepository.findById(lessonId).get()
            resourceRepository.save(Resource(0, title, resourcePath, resourceType, lesson))
        }
    }
}
