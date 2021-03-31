package pt.ulusofona.deisi.a2020.com.g33

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import pt.ulusofona.deisi.a2020.com.g33.fragments.*

abstract class NavigationManager {

    companion object{
        private fun placeFragment(fm:FragmentManager, fragment: Fragment){
            val transition = fm.beginTransaction()
            transition.replace(R.id.frame,fragment)
            transition.addToBackStack(null)
            transition.commit()
        }

        fun goToContactsFragment(fm: FragmentManager){
            placeFragment(fm,ContactsFragment())
        }

        fun goToDashboardFragment(fm: FragmentManager){
            placeFragment(fm,DashboardFragment())
        }

        fun goToExamListFragment(fm: FragmentManager){
            placeFragment(fm,ExamListFragment())
        }

        fun goToMapListSitesFragment(fm: FragmentManager){
            placeFragment(fm,MapListSitesFragment())
        }

        fun goToExamDetailsFragment(fm: FragmentManager){
            placeFragment(fm,ExamDetailsFragment())
        }

    }

}