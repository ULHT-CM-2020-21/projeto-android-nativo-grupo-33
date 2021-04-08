package pt.ulusofona.deisi.a2020.com.g33.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.map_item_expression.view.*
import pt.ulusofona.deisi.a2020.com.g33.classes.Places

class MapListSitesAdapter(private val context: Context,
                          private val layout: Int,
                          private val items:MutableList<Places>,
                          private val listener: OnItemClickListener
): RecyclerView.Adapter<MapListSitesAdapter.MapListSitesViewHolder>() {

    inner class MapListSitesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        val nameOfPlace: TextView = itemView.text_name_place
        val addressOfPlace: TextView = itemView.text_address_place

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if(position != RecyclerView.NO_POSITION){
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MapListSitesViewHolder {
        return MapListSitesViewHolder(LayoutInflater.from(context).inflate(layout,parent,false))
    }

    override fun onBindViewHolder(holder: MapListSitesViewHolder, position: Int) {
        holder.nameOfPlace.text  = items[position].nameOfPlace
        holder.addressOfPlace.text = items[position].addressOfPlace
    }

    override fun getItemCount() = items.size
}