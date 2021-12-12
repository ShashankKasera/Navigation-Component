package com.codeinglogs.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import com.codeinglogs.navigationcomponent.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        navController=navHostFragment.navController
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()||super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item_about_app ->{
                val action=MainNavGraphDirections.actionGlobalAboutAppFragment()
                navController.navigate(action)
                return true
            }
            else -> item.onNavDestinationSelected(navController)||super.onOptionsItemSelected(item)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
}