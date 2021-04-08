package pt.ulusofona.deisi.a2020.com.g33.fragments

import android.animation.Animator
import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import butterknife.OnClick
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_add_exam.view.*
import pt.ulusofona.deisi.a2020.com.g33.NavigationManager
import pt.ulusofona.deisi.a2020.com.g33.R
import java.util.*

class AddExamFragment : Fragment() {

    private var currentAnimator: Animator? = null

    private var shortAnimationDuration: Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_exam, container, false)
        val builder = MaterialDatePicker.Builder.datePicker()
        val today = MaterialDatePicker.todayInUtcMilliseconds()
        builder.setTitleText(R.string.Select_date)
        builder.setSelection(today)
        val materialDatePicker = builder.build()

        view.date_button.setOnClickListener {
            materialDatePicker.show(activity!!.supportFragmentManager, "DATE PICKER")
        }
        materialDatePicker.addOnPositiveButtonClickListener {
            view.date_text.text = materialDatePicker.headerText
        }

        view.registration_image.setOnClickListener{
            view.registration_image.setImageResource(R.drawable.text_document)
        }

        view.conclude_registration_button.setOnClickListener{
            NavigationManager.goToExamListFragment(activity!!.supportFragmentManager)
            //view.bottomNavigationView.naviga
        }

        return view
    }




}