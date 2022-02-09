package com.mamunsproject.youtubekids.UI.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mamunsproject.youtubekids.Adapter.VideoAdapter
import com.mamunsproject.youtubekids.Utils.Resource
import com.mamunsproject.youtubekids.ViewModel.VideoViewModelFactory
import com.mamunsproject.youtubekids.ViewModel.VideosViewModel
import com.mamunsproject.youtubekids.databinding.FragmentTomJerryBinding
import com.mamunsproject.youtubekids.repository.VideoRepository


class Tom_Jerry_Fragment : Fragment() {

    lateinit var viewModel: VideosViewModel
    lateinit var videoAdapter: VideoAdapter
    private lateinit var binding: FragmentTomJerryBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTomJerryBinding.inflate(inflater,container,false);

        return binding.root;

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val videoRepository = VideoRepository()
        val videoViewModelFactory = VideoViewModelFactory(videoRepository)
        viewModel = ViewModelProvider(this, videoViewModelFactory)[VideosViewModel::class.java]



        prepareCategoriesRecyclerView()
        viewModel.getTomJerryKeyFromFirestore()
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
        binding.tomJerryPB.visibility = View.INVISIBLE
    }

    private fun showProgressBar() {
        binding.tomJerryPB.visibility = View.VISIBLE
    }


    private fun prepareCategoriesRecyclerView() {

        videoAdapter = VideoAdapter()

        binding.tomJErryRC.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = videoAdapter
        }
    }

}