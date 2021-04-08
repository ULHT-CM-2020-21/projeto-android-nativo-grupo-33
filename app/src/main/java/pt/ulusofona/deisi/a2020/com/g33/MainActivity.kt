package pt.ulusofona.deisi.a2020.com.g33

import android.graphics.Color
import android.graphics.Color.*
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.DrawableCompat.getColorFilter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*
import pt.ulusofona.deisi.a2020.com.g33.NavigationManager
import pt.ulusofona.deisi.a2020.com.g33.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavigationManager.goToDashboardFragment(supportFragmentManager)
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false
        var isThisAreaSafe = true

        fab.setOnClickListener{
            NavigationManager.goToAddExamFragment(supportFragmentManager)
        }

        toolbar.setOnClickListener{
            isThisAreaSafe = if (isThisAreaSafe){
                status_circle.setColorFilter(RED)
                false
            }else{
                status_circle.setColorFilter(GREEN)
                true
            }
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