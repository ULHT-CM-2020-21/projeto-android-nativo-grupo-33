package pt.ulusofona.deisi.a2020.com.g33.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_map_list_sites.view.*
import pt.ulusofona.deisi.a2020.com.g33.R
import pt.ulusofona.deisi.a2020.com.g33.adapters.MapListSitesAdapter
import pt.ulusofona.deisi.a2020.com.g33.data.place1
import pt.ulusofona.deisi.a2020.com.g33.data.place2

class MapListSitesFragment : Fragment(), MapListSitesAdapter.OnItemClickListener {
    
    private val placesList = arrayListOf(place1, place2)

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_map_list_sites, container, false)
       view.list_sitios.layoutManager = LinearLayoutManager(activity as Context)
       view.list_sitios.adapter = MapListSitesAdapter(activity as Context, R.layout.map_item_expression, placesList, this)
       return view
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(Intent.ACTION_VIEW)
        when (position){
            0 -> intent.data = Uri.parse("geo:0,0?q=Av.+Prof.+Egas+Moniz+MB,+1649-028+Lisboa(Hospital+de+Santa+Maria)")
            1 -> intent.data = Uri.parse("geo:0,0?q=R.+José+António+Serrano,+1150-199+Lisboa(Hospital+de+Santa+Maria)")
        }
        val chooser = Intent.createChooser(intent,"Launch Maps")
        startActivity(chooser)
    }

}