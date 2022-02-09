package com.mamunsproject.youtubekids.Model

import java.util.*

data class ResponseVideo(

    var items: ArrayList<Video>,
    var nextPageToken: String

)
