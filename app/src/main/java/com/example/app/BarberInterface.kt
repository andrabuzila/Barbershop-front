package com.example.app

import retrofit2.Call
import retrofit2.http.GET

/**
 *
 */
interface BarberInterface {

    /**
     *
     */
    @GET("barber")
    fun getData(): Call<List<BarbersDataItem>>
}