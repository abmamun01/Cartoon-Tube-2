package com.mamunsproject.youtubekids.ViewModel


import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.mamunsproject.youtubekids.Model.ResponseVideo
import com.mamunsproject.youtubekids.Model.Video
import com.mamunsproject.youtubekids.Utils.Resource
import com.mamunsproject.youtubekids.repository.VideoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception


class VideosViewModel(val videoRepository: VideoRepository) : ViewModel() {


    private var videoViewModel2 = MutableLiveData<ArrayList<Video>>()

    val videoViewModel: MutableLiveData<Resource<ResponseVideo>> = MutableLiveData()
    private lateinit var HomedocumentReference: DocumentReference
    private lateinit var TomeJerrydocumentReference: DocumentReference
    private lateinit var BanglaCartdocumentReference: DocumentReference
    private lateinit var BendocumentReference: DocumentReference


    val maxResult: Int = 80
    val playListID: String = "PLf5D72Z_-C_WxboP01uSaltloc90fdYYu"
    val apiKey: String = "AIzaSyBQe0__ggAbF_iz5AUcTrq7G8Fjaj7mhcQ"



    var firebaseFirestore = FirebaseFirestore.getInstance()



    fun getHomeKeyFromFirestore() {

        HomedocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("ALL_CARTOON_ID")

        HomedocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("ALL_CARTOON_ID").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }



    fun getTomJerryKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("TOM_JERRY_ID")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("TOM_JERRY_ID").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }


    fun getMotuPatluKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("MOTUPATLU_ID")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("MOTUPATLU_ID").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }


    fun getBanglaCartonKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("BanglaCartoonPlayListKEY")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("1").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }
  fun getBenCartonKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("BEN_10_ID")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("BEN_10_ID").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }

    fun getDoreamonCartonKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("DOREAMON_ID")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("DOREAMON_ID").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }



    fun getHindiCartonKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("HINDI_CARTOON_ID")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("HINDI_CARTOON_ID").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }


    fun getMotupatluCartonKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("MOTUPATLU_ID")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("MOTUPATLU_ID").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }


    fun getMrBeanCartonKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("MR_BEAN_ID")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("MR_BEAN_ID").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }

    fun getOggyCokroachCartonKeyFromFirestore() {

        TomeJerrydocumentReference = firebaseFirestore.collection("AllPlayListKEY").document("OGGY_AND_COCKROACHES")

        TomeJerrydocumentReference
            .get().addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {

                    val key = documentSnapshot.getString("OGGY_AND_COCKROACHES").toString()

                    getVideosFromViewModel(key)

                    Log.d(
                        "THREAD",
                        "getVideosFromViewModel: ${Thread.currentThread().name} apiKey $key"
                    )

                } else {
                    // Toast.makeText(getContext(), "Does'nt Exist", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e: Exception? ->

            }

    }














    fun getVideosFromViewModel(playListIDF: String) {


        viewModelScope.launch(Dispatchers.IO) {

            videoViewModel.postValue(Resource.Loading())
            val response = videoRepository.getPost(maxResult, playListIDF, apiKey)
            //Fragment will automatically notify about that change
            videoViewModel.postValue(handleVideoResponse(response))

            Log.d("THREAD", "getVideosFromViewModel: ${Thread.currentThread().name} ")


        }
/*
        ApiClient.api.getAllVideos(maxResult, playListID, apiKey)
            .enqueue(object : Callback<ResponseVideo> {
                override fun onResponse(
                    call: Call<ResponseVideo>,
                    response: Response<ResponseVideo>
                ) {
                    response.body()?.let { categoryList ->
                        videoViewModel.postValue(categoryList.items)
                    }
                }

                override fun onFailure(call: Call<ResponseVideo>, t: Throwable) {

                }
        Log.d("THREAD", "getVideosFromViewModel: ${Thread.currentThread().name}")

            })*/


    }



    private fun handleVideoResponse(response: Response<ResponseVideo>): Resource<ResponseVideo> {

        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }


    fun observeVideoLiveData(): LiveData<ArrayList<Video>> {
        return videoViewModel2
    }


}