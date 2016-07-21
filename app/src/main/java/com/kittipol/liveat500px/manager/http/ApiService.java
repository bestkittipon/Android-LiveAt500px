package com.kittipol.liveat500px.manager.http;

import com.kittipol.liveat500px.dao.PhotoItemCollectionDao;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by KittipolC on 7/17/2016.
 */
public interface ApiService {
    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();
}
