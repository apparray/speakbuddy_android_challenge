package com.amazingtlr.api

import com.amazingtlr.api.model.FactListResponse
import com.amazingtlr.api.model.FactResponse
import kotlinx.coroutines.flow.Flow

interface FactRepository {
    fun observeFacts(neededPage: Int): Flow<NetworkResult<FactListResponse>>
}