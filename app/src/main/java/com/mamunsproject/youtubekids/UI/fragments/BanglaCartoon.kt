package com.mamunsproject.youtubekids.UI.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import com.google.firebase.firestore.FirebaseFirestore
import com.mamunsproject.youtubekids.Adapter.VideoAdapter
import com.mamunsproject.youtubekids.Utils.Resource
import com.mamunsproject.youtubekids.ViewModel.VideoViewModelFactory
import com.mamunsproject.youtubekids.ViewModel.VideosViewModel
import com.mamunsproject.youtubekids.databinding.FragmentBanglaCartoonBinding
import com.mamunsproject.youtubekids.repository.VideoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


class BanglaCartoon : Fragment() {


    lateinit var viewModel: VideosViewModel
    lateinit var videoAdapter: VideoAdapter
    private lateinit var binding: FragmentBanglaCartoonBinding
    var firebaseFirestore = FirebaseFirestore.getInstance()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentBanglaCartoonBinding.inflate(inflater, container, false);

        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val videoRepository = VideoRepository()
        val videoViewModelFactory = VideoViewModelFactory(videoRepository)
        viewModel = ViewModelProvider(this, videoViewModelFactory)[VideosViewModel::class.java]


        val job = Job()
        val uiScope = CoroutineScope(Dispatchers.IO + job)
        uiScope.launch(Dispatchers.IO) {

            viewModel.getBanglaCartonKeyFromFirestore()
            Log.d("THREAD", "HomeFragment: ${Thread.currentThread().name} ")
        }

        prepareCategoriesRecyclerView()
        viewModel.videoViewModel.observe(viewLifecycleOwner, Observer { response ->

            when (response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let { videoResponse ->
                        videoAdapter.setData(videoResponse.items)
                    }
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let { message ->

                        Log.e("TAG", "An Error occurred $message")
                    }
                }
                is Resource.Loading ->
                    showProgressBar()
            }

        })


    }

    private fun hideProgressBar() {
        binding.progressBarId.visibility = View.INVISIBLE
    }

    private fun showProgressBar() {
        binding.progressBarId.visibility = View.VISIBLE
    }


    private fun prepareCategoriesRecyclerView() {

        videoAdapter = VideoAdapter()

        binding.recyclerViewId.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = videoAdapter
        }
    }
}


