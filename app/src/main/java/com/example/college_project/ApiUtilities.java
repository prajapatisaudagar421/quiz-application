package com.example.college_project;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;



public class ApiUtilities {
    private static Retrofit retrofit = null;

    public static ApiInterface getApiInterface()
    {
        if (retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);



    }
}
