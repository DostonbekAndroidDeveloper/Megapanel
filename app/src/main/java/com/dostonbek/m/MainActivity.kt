package com.dostonbek.m

import NetworkUtils
import android.app.AlertDialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /*private lateinit var drawerLayout: DrawerLayout*/
  //  var firstPressTime:Long=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (!NetworkUtils.isNetworkAvailable(this)) {
            showNoInternetDialog()
        }


        /* drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)

         val toolbar = findViewById<Toolbar>(R.id.toolbar)
         setSupportActionBar(toolbar)

         val navigationView = findViewById<NavigationView>(R.id.nav_view)
         navigationView.setNavigationItemSelectedListener(this)

         val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)

         drawerLayout.addDrawerListener(toggle)
         toggle.syncState()*/

        /* if (savedInstanceState == null) {
             supportFragmentManager.beginTransaction()
                 .replace(R.id.fragmentContainer, AboutFragment()).commit()
             navigationView.setCheckedItem(R.id.nav_about)


         }*/
    }

    private fun showNoInternetDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Internet is disconnected")

        builder.setMessage("Please check your internet connection")
            .setPositiveButton("Try Again") { dialog, which ->
                // Check internet connection again
                if (!NetworkUtils.isNetworkAvailable(this@MainActivity)) {
                    // Show the dialog again if the internet is still disconnected
                    showNoInternetDialog()
                }
            }


        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
        alertDialog.setCanceledOnTouchOutside(false)

    }


    /*override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
                   }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            onBackPressedDispatcher.onBackPressed()
        }
    }*/
   /* override fun onBackPressed() {
        if (firstPressTime+ 400 >System.currentTimeMillis()){
            super.onBackPressed()
        } else {
            Toast.makeText(this,"Press back Twice to Exit",Toast.LENGTH_SHORT).show()

        }
        firstPressTime=System.currentTimeMillis()


    }*/
}