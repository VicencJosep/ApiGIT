package com.vogella.retrofitgerrit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface GitApi {

    @GET("changes/")
    Call<List<Change>> loadChanges(@Query("q") String status);
}
