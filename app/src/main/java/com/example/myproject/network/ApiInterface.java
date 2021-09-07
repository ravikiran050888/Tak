package com.example.myproject.network;

import com.example.myproject.model.CountryResponse;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("api_name") // use @POST if api is post.
    Call<CountryResponse> getResponseData();
}
