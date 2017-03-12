package com.bwialabs.epichallange.api;

/**
 * Created by Abdelkader on 12/03/2017.
 */
import com.bwialabs.epichallange.domain.Categorie;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface RestApi {

    @GET("/categorie-services/getAll")
    void getcat(Callback <Categorie> callback);



}
