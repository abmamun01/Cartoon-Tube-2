package com.mamunsproject.youtubekids.UI.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mamunsproject.youtubekids.Adapter.AdapterForPlayList;
import com.mamunsproject.youtubekids.Adapter.interfacew.OnRecyclerViewITemClickListener;
import com.mamunsproject.youtubekids.Model.PlayLIstModel;
import com.mamunsproject.youtubekids.R;

import java.util.ArrayList;
import java.util.List;


public class PlayListFragment_java extends Fragment implements OnRecyclerViewITemClickListener {

    AdapterForPlayList adapterForPlayList;
    List<PlayLIstModel> list;
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_play_list_java, container, false);


        list = new ArrayList<>();
        recyclerView = view.findViewById(R.id.rc_playlist);


        list.add(new PlayLIstModel(R.drawable.tom_and_jerrry, "Tom&Jerry"));
        list.add(new PlayLIstModel(R.drawable.motupatlu, "Moto Patlu"));
        list.add(new PlayLIstModel(R.drawable.doraemon, "Doreamon"));
        list.add(new PlayLIstModel(R.drawable.ben10, "Ben 10"));
        list.add(new PlayLIstModel(R.drawable.oggyfinal, "Oggy and CoakRoaches"));
        list.add(new PlayLIstModel(R.drawable.mrbean, "Mr Bean"));
        list.add(new PlayLIstModel(R.drawable.hindicartoon, "Hindi Cartoon"));
        list.add(new PlayLIstModel(R.drawable.banglacarton, "Bangla Cartoon"));


        adapterForPlayList = new AdapterForPlayList(list, this::onRecItemClick);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(adapterForPlayList);

        return view;

    }

    @Override
    public void onRecItemClick(int position) {

        if (position == 0) {
            NavController navController = NavHostFragment.findNavController(this);


            navController.navigate(R.id.action_playlistFragments_to_tom_Jerry_Fragment,
                    null,
                    new NavOptions.Builder()
                            .setEnterAnim(R.anim.animate_slide_in_left)
                            .setExitAnim(R.anim.animate_slide_out_right)
                            .build());
        } else if (position == 1) {
            NavController navController1 = NavHostFragment.findNavController(this);

            navController1.navigate(R.id.action_playlistFragments_to_motuPatluFragment, null, new NavOptions.Builder()
                    .setEnterAnim(R.anim.animate_slide_in_left)
                    .setExitAnim(R.anim.animate_slide_out_right)
                    .build());
        } else if (position == 2) {
            NavController navController2r = NavHostFragment.findNavController(this);

            navController2r.navigate(R.id.action_playlistFragments_to_doaemonFragment, null, new NavOptions.Builder()
                    .setEnterAnim(R.anim.animate_slide_in_left)
                    .setExitAnim(R.anim.animate_slide_out_right)
                    .build());
        } else if (position == 3) {
            NavController navController3 = NavHostFragment.findNavController(this);

            navController3.navigate(R.id.action_playlistFragments_to_ben10, null, new NavOptions.Builder()
                    .setEnterAnim(R.anim.animate_slide_in_left)
                    .setExitAnim(R.anim.animate_slide_out_right)
                    .build());

        } else if (position == 4) {
            NavController navController4 = NavHostFragment.findNavController(this);

            navController4.navigate(R.id.action_playlistFragments_to_oggyAndCokroachesFragment, null, new NavOptions.Builder()
                    .setEnterAnim(R.anim.animate_slide_in_left)
                    .setExitAnim(R.anim.animate_slide_out_right)
                    .build());
        } else if (position == 5) {
            NavController navController5 = NavHostFragment.findNavController(this);

            navController5.navigate(R.id.action_playlistFragments_to_mrBeanCartoonFragment, null, new NavOptions.Builder()
                    .setEnterAnim(R.anim.animate_slide_in_left)
                    .setExitAnim(R.anim.animate_slide_out_right)
                    .build());
        } else if (position == 6) {
            NavController navController6 = NavHostFragment.findNavController(this);

            navController6.navigate(R.id.action_playlistFragments_to_hindiCartoonFragment, null, new NavOptions.Builder()
                    .setEnterAnim(R.anim.animate_slide_in_left)
                    .setExitAnim(R.anim.animate_slide_out_right)
                    .build());

        } else if (position == 7) {
            NavController navController7 = NavHostFragment.findNavController(this);

            navController7.navigate(R.id.action_playlistFragments_to_banglaCartoon2, null, new NavOptions.Builder()
                    .setEnterAnim(R.anim.animate_slide_in_left)
                    .setExitAnim(R.anim.animate_slide_out_right)
                    .build());

        }



  /*      switch (position) {


            case 0:
                NavController navController = NavHostFragment.findNavController(this);


                navController.navigate(R.id.action_playlistFragments_to_tom_Jerry_Fragment,
                        null,
                        new NavOptions.Builder()
                                .setEnterAnim(android.R.animator.fade_in)
                                .setExitAnim(android.R.animator.fade_out)
                                .build());





            case 1:
                NavController navController1 = NavHostFragment.findNavController(this);

                navController1.navigate(R.id.action_playlistFragments_to_motuPatluFragment, null, new NavOptions.Builder()
                                .setEnterAnim(android.R.animator.fade_in)
                                .setExitAnim(android.R.animator.fade_out)
                                .build());


            case 2:
                NavController navController2r = NavHostFragment.findNavController(this);

                navController2r.navigate(R.id.action_playlistFragments_to_doaemonFragment, null, new NavOptions.Builder()
                                .setEnterAnim(android.R.animator.fade_in)
                                .setExitAnim(android.R.animator.fade_out)
                                .build());


            case 3:
                NavController navController3 = NavHostFragment.findNavController(this);

                navController3.navigate(R.id.ben10, null, new NavOptions.Builder()
                                .setEnterAnim(android.R.animator.fade_in)
                                .setExitAnim(android.R.animator.fade_out)
                                .build());


            case 4:
                NavController navController4 = NavHostFragment.findNavController(this);

                navController4.navigate(R.id.oggyAndCokroachesFragment, null, new NavOptions.Builder()
                                .setEnterAnim(android.R.animator.fade_in)
                                .setExitAnim(android.R.animator.fade_out)
                                .build());


            case 5:
                NavController navController5 = NavHostFragment.findNavController(this);

                navController5.navigate(R.id.mrBeanCartoonFragment, null, new NavOptions.Builder()
                                .setEnterAnim(android.R.animator.fade_in)
                                .setExitAnim(android.R.animator.fade_out)
                                .build());



            case 6:
                NavController navController6 = NavHostFragment.findNavController(this);

                navController6.navigate(R.id.hindiCartoonFragment, null, new NavOptions.Builder()
                                .setEnterAnim(android.R.animator.fade_in)
                                .setExitAnim(android.R.animator.fade_out)
                                .build());



            case 7:
                NavController navController7 = NavHostFragment.findNavController(this);

                navController7.navigate(R.id.banglaCartoon2, null, new NavOptions.Builder()
                                .setEnterAnim(android.R.animator.fade_in)
                                .setExitAnim(android.R.animator.fade_out)
                                .build());






        }*/

    }
}