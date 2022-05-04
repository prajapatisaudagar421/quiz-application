package com.example.college_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class HealthFragment extends Fragment {
    String api = "e285636f561a423c892e26714dc35778";
    ArrayList<ModelClass1> modelClass1ArrayList;
    Adapter adapter;
    String country="in";
    private RecyclerView recyclerViewofhealth;
    private String category="health";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.healthfragment,null);
        recyclerViewofhealth=v.findViewById(R.id.recyclerviewofhealth);
        modelClass1ArrayList=new ArrayList<>();
        recyclerViewofhealth.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(),modelClass1ArrayList);
        recyclerViewofhealth.setAdapter(adapter);

        findNews();
        return v;
    }

    private void findNews() {
        ApiUtilities.getApiInterface().getCategotyNews(country,category,100,api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Response<mainNews> response, Retrofit retrofit) {
                if(response.isSuccess())
                {
                    modelClass1ArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}



