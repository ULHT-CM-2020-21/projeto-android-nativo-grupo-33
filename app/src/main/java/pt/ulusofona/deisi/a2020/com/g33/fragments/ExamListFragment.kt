package pt.ulusofona.deisi.a2020.com.g33.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_exam_list.view.*
import pt.ulusofona.deisi.a2020.com.g33.NavigationManager
import pt.ulusofona.deisi.a2020.com.g33.R
import pt.ulusofona.deisi.a2020.com.g33.adapters.ExamListAdapter
import pt.ulusofona.deisi.a2020.com.g33.data.*


class ExamListFragment : Fragment(), ExamListAdapter.OnItemClickListener {

    private val examsList = arrayListOf(exam1, exam2, exam3, exam4)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exam_list, container, false)
        view.list_exam.adapter = ExamListAdapter(activity as Context, R.layout.list_item_expression, examsList, this)
        view.list_exam.layoutManager = LinearLayoutManager(activity as Context)
        return view
    }

    override fun onItemClick(position: Int) {
        NavigationManager.goToExamDetailsFragment(activity!!.supportFragmentManager)
    }
}