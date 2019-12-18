package com.study.vapinginfo

import android.os.Parcel
import android.os.Parcelable

data class Vapor(
    var name: String? = "",
    var details: String? = "",
    var photo: Int? = 0
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(details)
        parcel.writeValue(photo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Vapor> {
        override fun createFromParcel(parcel: Parcel): Vapor {
            return Vapor(parcel)
        }

        override fun newArray(size: Int): Array<Vapor?> {
            return arrayOfNulls(size)
        }
    }
}