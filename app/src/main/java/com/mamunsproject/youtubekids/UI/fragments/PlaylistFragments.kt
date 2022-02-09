package com.mamunsproject.youtubekids.UI.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.mamunsproject.youtubekids.Adapter.AdapterForPlayList
import com.mamunsproject.youtubekids.Model.PlayLIstModel
import com.mamunsproject.youtubekids.R


class PlaylistFragments : Fragment() {


    private lateinit var tomJerryCard: CardView
    private lateinit var motuPatluCard: CardView
    private lateinit var oggyandCoackroachesCard: CardView
    private lateinit var doraemonCard: CardView
    private lateinit var ben10: CardView
    private lateinit var banglaCartoon: CardView
    private lateinit var mrBeanCard: CardView
    private lateinit var hindiCartoon: CardView


    private lateinit var tomJerryIMG: ImageView
    private lateinit var motuPatluIMG: ImageView
    private lateinit var oggyAndCokroachIMG: ImageView
    private lateinit var doraemonIMG: ImageView
    private lateinit var ben10IMG: ImageView
    private lateinit var banglaCartoonIMG: ImageView
    private lateinit var hindiCartoonIMG: ImageView

    private lateinit var playListAdapter: AdapterForPlayList
    private lateinit var recyclerView: RecyclerView
    private lateinit var playListModel: List<PlayLIstModel>



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_playlist_fragments, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

/*        tomJerryCard = view.findViewById(R.id.tomJerryCard)
        motuPatluCard = view.findViewById(R.id.motuPatluCard)

        oggyandCoackroachesCard = view.findViewById(R.id.oggy_and_coakroaches_Card)
        doraemonCard = view.findViewById(R.id.doraemonCard)
        ben10 = view.findViewById(R.id.benTenCard)
        banglaCartoon = view.findViewById(R.id.banglaCartoon)
        mrBeanCard = view.findViewById(R.id.mrBeanCard)
        hindiCartoon = view.findViewById(R.id.hindiCartoonCard)*/


/*
        tomJerryIMG=view.findViewById(R.id.tomImage)
        motuPatluIMG=view.findViewById(R.id.motupatluImg)
        oggyAndCokroachIMG=view.findViewById(R.id.oggy_img)
        ben10IMG=view.findViewById(R.id.ben_10IMg)
        doraemonIMG=view.findViewById(R.id.doreamonIMG)
        banglaCartoonIMG=view.findViewById(R.id.bangla_img)
        hindiCartoonIMG=view.findViewById(R.id.hindiIMG)
*/

        Log.d("THREAD", "PlayLIST: ${Thread.currentThread().name} ")


/*

            tomJerryIMG.setImageDrawable(resources.getDrawable(R.drawable.tom_and_jerrry))
            motuPatluIMG.setImageDrawable(resources.getDrawable(R.drawable.motupatlu))
            oggyAndCokroachIMG.setImageDrawable(resources.getDrawable(R.drawable.oggyfinal))
            ben10IMG.setImageDrawable(resources.getDrawable(R.drawable.ben10))
            doraemonIMG.setImageDrawable(resources.getDrawable(R.drawable.doraemon))
            banglaCartoonIMG.setImageDrawable(resources.getDrawable(R.drawable.banglacarton))
            hindiCartoonIMG.setImageDrawable(resources.getDrawable(R.drawable.hindicartoon))

*/




        recyclerView = view.findViewById(R.id.rc_playlist)




/*

        tomJerryCard.setOnClickListener {

            val action = PlaylistFragmentsDirections.actionPlaylistFragmentsToTomJerryFragment()
            Navigation.findNavController(it).navigate(action)


        }



        motuPatluCard.setOnClickListener {

            val action = PlaylistFragmentsDirections.actionPlaylistFragmentsToMotuPatluFragment()
            Navigation.findNavController(it).navigate(action)

        }


        doraemonCard.setOnClickListener {

            val action = PlaylistFragmentsDirections.actionPlaylistFragmentsToDoaemonFragment()
            Navigation.findNavController(it).navigate(action)

        }


        hindiCartoon.setOnClickListener {

            val action = PlaylistFragmentsDirections.actionPlaylistFragmentsToHindiCartoonFragment()
            Navigation.findNavController(it).navigate(action)

        }


        oggyandCoackroachesCard.setOnClickListener {

            val action = PlaylistFragmentsDirections.actionPlaylistFragmentsToOggyAndCokroachesFragment()
            Navigation.findNavController(it).navigate(action)

        }


        banglaCartoon.setOnClickListener {

            val action = PlaylistFragmentsDirections.actionPlaylistFragmentsToBanglaCartoon2()
            Navigation.findNavController(it).navigate(action)

        }



        ben10.setOnClickListener {

            val action = PlaylistFragmentsDirections.actionPlaylistFragmentsToBen10()
            Navigation.findNavController(it).navigate(action)

        }


        mrBeanCard.setOnClickListener {

            val action = PlaylistFragmentsDirections.actionPlaylistFragmentsToMrBeanCartoonFragment()
            Navigation.findNavController(it).navigate(action)

        }
*/


    }
}