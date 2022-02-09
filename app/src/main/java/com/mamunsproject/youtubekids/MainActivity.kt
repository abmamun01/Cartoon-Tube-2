package com.mamunsproject.youtubekids

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.mamunsproject.youtubekids.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)
        //initRecyclerview()
        Log.d("INADAPTERSITUATION", "onCreate ")



        val navController=findNavController(R.id.fragmentContainerView)
        binding.bottomNavigation.setupWithNavController(navController)







        //prepareCategoriesRecyclerView()
        //videoViewModel.getVideosFromViewModel()
        // onObserveCategoriesLiveData()

/*        videoViewModel.videoViewModel.observe(this, Observer { response ->

            when (response) {
                is Resource.Success -> {
                    Log.e("THREAD", "Success Response")

                    hideProgressBar()
                    response.data?.let<ResponseVideo, Unit>(fun(newsResponse: ResponseVideo) {
                        videoAdapter.setData(newsResponse.items)
                    })
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let { message ->

                        Log.e("THREAD", "An Error occurred $message")
                    }
                }
                is Resource.Loading ->

                    showProgressBar()
            }

        })*/



    }

/*    private fun prepareCategoriesRecyclerView() {

        videoAdapter = VideoAdapter()
        binding.recyclerViewInMain.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = videoAdapter
        }
    }*/





    var isNavigationHide = false

     fun animateNavigation(hide: Boolean) {
        if (isNavigationHide && hide || !isNavigationHide && !hide) return
        isNavigationHide = hide
        val moveY = if (hide) 2 * binding.bottomNavigation.getHeight() else 0
        binding.bottomNavigation.animate().translationY(moveY.toFloat()).setStartDelay(100).setDuration(300).start()

    }
/*    private fun hideProgressBar() {
        binding.progressBar.visibility = View.INVISIBLE
    }

    private fun showProgressBar() {
        binding.progressBar.visibility = View.VISIBLE
    }*/

/*    private fun initRecyclerview() {

        videoAdapter = VideoAdapter(this, ArrayList())
        Log.d("INADAPTERSITUATION", "INIT REC")

        recyclerViewInMain.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = videoAdapter
        }
    }*/
}