package com.cacttus.navigationdrawergr_3.api

import com.cacttus.navigationdrawergr_3.model.Comment
import com.cacttus.navigationdrawergr_3.model.Post
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceApi {
    @GET("posts")
    fun getPosts(): Call<List<Post>>

    @GET("posts/{id}")
    fun getPostById(@Path("id") id: Int): Call<Post>

    @GET("comments")
    fun getCommentsByPostId(@Query("postId") postId: Int): Call<List<Comment>>
}