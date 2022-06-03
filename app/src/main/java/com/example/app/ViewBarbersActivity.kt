package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_view_barbers.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 *
 */
class ViewBarbersActivity : AppCompatActivity() {
    private val BASE_URL = "http://192.168.56.1:8080/barber/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_barbers)

        getMyData();
    }

    /**
     *
     */
    private fun getMyData(){
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(BarberInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<BarbersDataItem>?> {
            override fun onResponse(
                call: Call<List<BarbersDataItem>?>,
                response: Response<List<BarbersDataItem>?>
            ) {
                val responseBody = response.body()!!

                val myStringBuilder = StringBuilder()
                for (myData in responseBody){
                    //myStringBuilder.append("Barber: ")
                    myStringBuilder.append(myData.name)
//                    myStringBuilder.append(" Service: ")
//                    myStringBuilder.append(myData.services)
//                    myStringBuilder.append("\n")
                }

                txt.text = myStringBuilder

            }

            override fun onFailure(call: Call<List<BarbersDataItem>?>, t: Throwable) {
                Log.d("BarberActivity", "onFailure"+t.message)
            }
        })
    }
}