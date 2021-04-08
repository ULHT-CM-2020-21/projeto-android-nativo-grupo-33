package pt.ulusofona.deisi.a2020.com.g33.classes

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class Statistics(val activeCases: Int,
                 val confirmedCases: Int,
                 val numberOfRecoveredCases: Int,
                 val deaths: Int,
                 val peopleOnHospital: Int,
                 val peopleOnICU: Int)