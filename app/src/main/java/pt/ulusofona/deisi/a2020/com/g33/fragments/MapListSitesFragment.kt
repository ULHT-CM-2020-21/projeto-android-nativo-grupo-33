package pt.ulusofona.deisi.a2020.com.g33.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pt.ulusofona.deisi.a2020.com.g33.R

class MapListSitesFragment : Fragment() {
   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map_list_sites, container, false)
    }

}