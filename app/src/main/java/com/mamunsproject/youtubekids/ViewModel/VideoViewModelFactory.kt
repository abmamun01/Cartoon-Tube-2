package com.mamunsproject.youtubekids.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mamunsproject.youtubekids.repository.VideoRepository

class VideoViewModelFactory(private val videoRepository: VideoRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return VideosViewModel(videoRepository) as T
    }
}