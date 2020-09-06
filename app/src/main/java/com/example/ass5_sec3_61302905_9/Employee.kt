package com.example.ass5_sec3_61302905_9

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee (val EmpName:String, val gender:String, val email:String, val salary:String)  : Parcelable {

}