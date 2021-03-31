package pt.ulusofona.deisi.a2020.com.g33.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import pt.ulusofona.deisi.a2020.com.g33.NavigationManager
import pt.ulusofona.deisi.a2020.com.g33.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavigationManager.goToDashboardFragment(supportFragmentManager)
        bottomNavigationView.background =null
        bottomNavigationView.menu.getItem(2).isEnabled = false


        fab.setOnClickListener{

        }

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.dashboard -> NavigationManager.goToDashboardFragment(supportFragmentManager)
                R.id.list -> NavigationManager.goToExamListFragment(supportFragmentManager)
                R.id.map_list_sites -> NavigationManager.goToMapListSitesFragment(supportFragmentManager)
                R.id.contacts -> NavigationManager.goToContactsFragment(supportFragmentManager)
            }
            true
        }

    }


}