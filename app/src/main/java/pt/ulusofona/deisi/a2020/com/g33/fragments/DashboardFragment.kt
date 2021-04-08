package pt.ulusofona.deisi.a2020.com.g33.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dashboard.view.*
import pt.ulusofona.deisi.a2020.com.g33.R
import pt.ulusofona.deisi.a2020.com.g33.classes.Statistics

class DashboardFragment : Fragment() {
    private val stats = Statistics(1500,20000,15000,500,800,150)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        setViewValues(view)
        return view
    }

    private fun setViewValues(view: View){
        view.active_cases_number.text = stats.activeCases.toString()
        view.confirmed_cases_number.text = stats.confirmedCases.toString()
        view.recovered_cases_number.text  = stats.numberOfRecoveredCases.toString()
        view.deaths_number.text = stats.deaths.toString()
        view.people_hospital_number.text = stats.peopleOnHospital.toString()
        view.people_ICU_number.text = stats.peopleOnICU.toString()
    }

}