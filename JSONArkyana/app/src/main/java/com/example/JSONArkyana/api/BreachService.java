package com.example.JSONArkyana.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BreachService {
    @GET("breaches")
    Call<List<BreachResponse>> getAllBreach();
}
