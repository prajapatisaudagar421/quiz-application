package com.example.college_project;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

public interface ApiInterface {
    String BASE_URL = "https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainNews> getNews(
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey

    );
    @GET("top-headlines")
    Call<mainNews> getCategotyNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey

    );
}
