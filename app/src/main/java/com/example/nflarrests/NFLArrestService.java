package com.example.nflarrests;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NFLArrestService {
    @GET("api/v1/crime/topPlayers/{crime}")
    Call<NFLCrimeResponse> searchByArrests(@Path("crime")String crime);
}
