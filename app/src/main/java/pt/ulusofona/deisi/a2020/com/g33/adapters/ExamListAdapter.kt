package pt.ulusofona.deisi.a2020.com.g33.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pt.ulusofona.deisi.a2020.com.g33.classes.Exams

class ExamListAdapter(private val context: Context,private val layout: Int,
                      private val items:MutableList<Exams>, private val listener: OnItemClickListener): RecyclerView.Adapter<ExamListAdapter.ExamListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamListViewHolder {
        return ExamListViewHolder(LayoutInflater.from(context).inflate(layout,parent,false))
    }

    override fun onBindViewHolder(holder: ExamListAdapter.ExamListViewHolder, position: Int) {

    }

    override fun getItemCount() = items.size

    inner class ExamListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{

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


}