package pt.ulusofona.deisi.a2020.com.g33.classes

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.Date

@Parcelize
class Exams(val date: Date, val result: String, val placeOfTest : String): Parcelable