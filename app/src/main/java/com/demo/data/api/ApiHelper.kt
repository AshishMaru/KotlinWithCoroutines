package com.demo.data.api

import com.demo.data.api.ApiService

class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
}