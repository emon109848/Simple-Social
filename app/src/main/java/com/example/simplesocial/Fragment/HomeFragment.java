package com.example.simplesocial.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simplesocial.Adapter.DashBoardAdapter;
import com.example.simplesocial.Adapter.StoryAdapter;
import com.example.simplesocial.Model.DashBoardModel;
import com.example.simplesocial.Model.StoryModel;
import com.example.simplesocial.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView storyRV,dashBoardRV;
    ArrayList<StoryModel> list;
    ArrayList<DashBoardModel> dashBoardList;

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        storyRV = view.findViewById(R.id.storyRV);
        list = new ArrayList<>();
        list.add(new StoryModel(R.drawable.img,R.drawable.live,R.drawable.img,"SH Emon"));
        list.add(new StoryModel(R.drawable.img,R.drawable.live,R.drawable.img,"SH Emon"));
        list.add(new StoryModel(R.drawable.img,R.drawable.live,R.drawable.img,"SH Emon"));
        list.add(new StoryModel(R.drawable.img,R.drawable.live,R.drawable.img,"SH Emon"));
        list.add(new StoryModel(R.drawable.img,R.drawable.live,R.drawable.img,"SH Emon"));

        StoryAdapter adapter = new StoryAdapter(list, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        storyRV.setLayoutManager(linearLayoutManager);
        storyRV.setNestedScrollingEnabled(false);
        storyRV.setAdapter(adapter);

        dashBoardRV =view.findViewById(R.id.dashBoard_RV);
        dashBoardList = new ArrayList<>();

        dashBoardList.add(new DashBoardModel(R.drawable.img,R.drawable.img,R.drawable.bookmark,"SH Emon","152","52","10"));
        dashBoardList.add(new DashBoardModel(R.drawable.img,R.drawable.img,R.drawable.bookmark,"SH Emon","152","52","10"));
        dashBoardList.add(new DashBoardModel(R.drawable.img,R.drawable.img,R.drawable.bookmark,"SH Emon","152","52","10"));
        dashBoardList.add(new DashBoardModel(R.drawable.img,R.drawable.img,R.drawable.bookmark,"SH Emon","152","52","10"));
        dashBoardList.add(new DashBoardModel(R.drawable.img,R.drawable.img,R.drawable.bookmark,"SH Emon","152","52","10"));

        DashBoardAdapter dashBoardAdapter = new DashBoardAdapter(dashBoardList,getContext());
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        dashBoardRV.setLayoutManager(linearLayoutManager1);
        dashBoardRV.setNestedScrollingEnabled(false);
        dashBoardRV.setAdapter(dashBoardAdapter);


        return view;
    }
}