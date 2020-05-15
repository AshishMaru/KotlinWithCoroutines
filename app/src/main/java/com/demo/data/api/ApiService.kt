package com.demo.data.api

import com.demo.data.model.Restaurants
import retrofit2.http.GET

interface ApiService {



    @GET("""search?categoryId=${Constant.CATEGORY_ID}&ll=${Constant.FUELED_LAY_LNG}&limit=${Constant.LIMIT}&client_id=${Constant.CLIENT_ID}&client_secret=${Constant.CLIENT_SECRET}&v=${Constant.VERSIONING}""")
    suspend fun getUsers(): Restaurants

}