package com.date.data.network

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiInterface {
    @POST("/api/v1/users/{user_id}/profiles/activate")
    fun getProfiles(@Path("user_id")  userId : String) : Single<Any>

}
