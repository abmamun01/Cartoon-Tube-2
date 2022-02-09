package com.mamunsproject.youtubekids.repository

import com.mamunsproject.youtubekids.Retrofit.ApiClient

class VideoRepository {

    suspend fun getPost(maxResult: Int, playListID: String, apiKey: String) =
        ApiClient.api.getAllVideos(maxResult, playListID, apiKey)


}