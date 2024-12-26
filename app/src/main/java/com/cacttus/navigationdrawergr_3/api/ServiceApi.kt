package com.cacttus.navigationdrawergr_3.api

import com.cacttus.navigationdrawergr_3.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface ServiceApi {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}