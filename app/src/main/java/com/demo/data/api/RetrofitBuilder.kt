package com.demo.data.api

import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitBuilder {


    // I know this is not good way to use all the parameters in base url but as you know currenly I've to submit this by using
    // single Url so I use parameters in base url
    private const val BASE_URL = "https://api.foursquare.com/v2/venues/"

    val httpLoggingInterceptor =
        HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
    val okHttpClient =
        OkHttpClient.Builder().connectTimeout(5, TimeUnit.MINUTES).writeTimeout(5, TimeUnit.MINUTES)
            .readTimeout(5, TimeUnit.MINUTES)
            .connectionPool(ConnectionPool(0, (5 * 60 * 1000).toLong(), TimeUnit.SECONDS))
            .addInterceptor(httpLoggingInterceptor).build()

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}