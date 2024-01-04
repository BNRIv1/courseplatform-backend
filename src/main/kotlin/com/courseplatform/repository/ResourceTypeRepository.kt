package com.courseplatform.repository

import com.courseplatform.domain.ResourceType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ResourceTypeRepository : JpaRepository<ResourceType, Int> {

}
