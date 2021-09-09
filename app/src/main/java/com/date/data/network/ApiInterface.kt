package com.date.data.network

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST()
    fun submitSession() : Single<Any>
}
