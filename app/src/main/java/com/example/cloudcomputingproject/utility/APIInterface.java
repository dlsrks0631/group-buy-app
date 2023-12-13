package com.example.cloudcomputingproject.utility;

import com.example.cloudcomputingproject.datas.CategoryDataResponse;
import com.example.cloudcomputingproject.datas.LikeData;
import com.example.cloudcomputingproject.datas.LikeDataResponse;
import com.example.cloudcomputingproject.datas.LikePostData;
import com.example.cloudcomputingproject.datas.LikePostDataReponse;
import com.example.cloudcomputingproject.datas.MainPostDataGet;
import com.example.cloudcomputingproject.datas.MainPostDataGetResponse;
import com.example.cloudcomputingproject.datas.PostDataPut;
import com.example.cloudcomputingproject.datas.PostDataPutResponse;
import com.example.cloudcomputingproject.datas.PostViewGet;
import com.example.cloudcomputingproject.datas.PostViewGetResponse;
import com.example.cloudcomputingproject.datas.UserDataGet;
import com.example.cloudcomputingproject.datas.UserDataGetResponse;
import com.example.cloudcomputingproject.datas.UserDataInsert;
import com.example.cloudcomputingproject.datas.UserDataInsertResponse;
import com.example.cloudcomputingproject.datas.UserDataUpdate;
import com.example.cloudcomputingproject.datas.UserDataUpdateResponse;
import com.example.cloudcomputingproject.datas.CategoryData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIInterface {
    @POST("/user/add")
    Call<UserDataInsertResponse> userLoginInsert(@Body UserDataInsert data);

    @POST("/post/add")
    Call<PostDataPutResponse> PostInsert(@Body PostDataPut data);

    @POST("/category/get")
    Call<CategoryDataResponse> CategoryGet();

    @POST("/user/get")
    Call<UserDataGetResponse> UserGet(@Body UserDataGet data);

    @POST("/postlist/get")
    Call<MainPostDataGetResponse> PostListGet(@Body MainPostDataGet data);


    @POST("/user/update")
    Call<UserDataUpdateResponse> UserUpdate(@Body UserDataUpdate data);

    @POST("/category/add")
    Call<CategoryDataResponse> addCategory(@Body CategoryData category);

    @POST("/user/postview/get")
    Call<PostViewGetResponse> PostViewGet(@Body PostViewGet data);

    @POST("/like")
    Call<LikeDataResponse> LikeDataControl(@Body LikeData data);

    @POST("/like/post")
    Call<LikePostDataReponse> LikePostData(@Body LikePostData data);
}
