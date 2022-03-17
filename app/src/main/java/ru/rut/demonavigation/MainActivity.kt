package ru.rut.demonavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        //bottomNavigationView.setupWithNavController(navController)

//        appBarConfiguration = AppBarConfiguration(
//            setOf(R.id.firstFragment, R.id.secondFragment)
//        )

//        setupActionBarWithNavController(navController, appBarConfiguration)



//        bottomNavigationView.setOnItemSelectedListener {
//            when(it.itemId) {
//                R.id.action_firstFragment -> {
//                    navController.navigate(R.id.action_secondFragment_to_firstFragment)
//                    return@setOnItemSelectedListener true
//                }
//                R.id.action_secondFragment -> {
//                    navController.navigate(R.id.action_firstFragment_to_secondFragment2)
//                    return@setOnItemSelectedListener true
//                }
//                else -> {
//                    return@setOnItemSelectedListener false
//                }
//            }
//        }


    }

}