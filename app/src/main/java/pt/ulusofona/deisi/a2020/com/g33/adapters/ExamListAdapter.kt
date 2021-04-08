package pt.ulusofona.deisi.a2020.com.g33.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pt.ulusofona.deisi.a2020.com.g33.classes.Exams
import kotlinx.android.synthetic.main.list_item_expression.view.*

class ExamListAdapter(private val context: Context,
                      private val layout: Int,
                      private val items:MutableList<Exams>,
                      private val listener: OnItemClickListener
):RecyclerView.Adapter<ExamListAdapter.ExamListViewHolder>() {

    inner class ExamListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        val date: TextView = itemView.text_date
        val result: TextView = itemView.text_result
        val placeOfTest : TextView = itemView.text_placeOfTest

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamListViewHolder {
        return ExamListViewHolder(LayoutInflater.from(context).inflate(layout,parent,false))
    }

    override fun onBindViewHolder(holder: ExamListViewHolder, position: Int) {
        holder.date.text = items[position].date
        holder.result.text = items[position].result
        holder.placeOfTest.text = items[position].placeOfTest
    }

    override fun getItemCount() = items.size


}

