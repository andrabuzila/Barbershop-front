package com.example.app

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class BarbersDataItem(
    val idbarber: Int,
    val image: String,
    val name: String,
    val phonenumber: String,
    val services: String
)