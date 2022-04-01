package com.example.mycontact

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String? = null,
    val phoneNumber: Long? = null
): Parcelable
