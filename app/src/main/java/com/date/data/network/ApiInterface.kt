package com.date.data.network

import com.date.di.entity.People
import io.reactivex.Single
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiInterface {
    @POST("/api/v1/users/{user_id}/profiles/activate")
    fun getProfiles(@Path("user_id")  userId : String) : Single<People>
}
