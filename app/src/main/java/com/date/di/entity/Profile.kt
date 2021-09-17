package com.date.di.entity

import com.google.gson.annotations.SerializedName

data class Profile(@SerializedName("id") val  id: String,
                   @SerializedName("active") val  active: Boolean,
                   @SerializedName("about_me") val  aboutMe: String,
                   @SerializedName("age") val  age: Int,
                   @SerializedName("college_name") val  collegeName: String,
                   @SerializedName("company_name") val  companyName: String,
                   @SerializedName("current_city") val  currentCity: String,
                   @SerializedName("dob") val  dob: String,
                   @SerializedName("drink") val  drink: String,
                   @SerializedName("education") val  education: String,
                   @SerializedName("exercise") val  exercise: String,
                   @SerializedName("gender") val  gender: Int,
                   @SerializedName("height") val  height: Float,
                   @SerializedName("images") val  hometown: ArrayList<String>,
                   @SerializedName("kids") val  kids: Int,
                   @SerializedName("name") val  name: String,
                   @SerializedName("pets") val  pets: String,
                   @SerializedName("smoke") val  smoke: String,
                   @SerializedName("verification_image") val  verification_image: String? =null,
                   @SerializedName("verified") val  verified: Boolean,
                   @SerializedName("created_at") val  createdAt: String,
                   @SerializedName("updated_at") val  updatedAt: String,
)

