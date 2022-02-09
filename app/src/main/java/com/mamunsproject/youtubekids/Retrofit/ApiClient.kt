package com.mamunsproject.youtubekids.Retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {

        var BASE_URL: String = "https://www.googleapis.com/youtube/v3/"


        //Lazy use korar karon hocce akhon e call hobe na ata jokhon call kora hobe tokhon e call hobe
        private val retrofit by lazy {

            val loggin = HttpLoggingInterceptor()
            loggin.setLevel(HttpLoggingInterceptor.Level.BODY)

            val client = OkHttpClient.Builder()
                .addInterceptor(loggin)
                .build()

            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()


        }

        val api by lazy {
            retrofit.create(ApiInterface::class.java)
        }

    }
}