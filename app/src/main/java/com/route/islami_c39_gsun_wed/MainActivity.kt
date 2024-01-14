package com.route.islami_c39_gsun_wed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.route.islami_c39_gsun_wed.fragments.HomeFragment
import com.route.islami_c39_gsun_wed.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    lateinit var homeTextView: TextView
    lateinit var profileTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Whats App Tabs -> Chats - Status - Calls
        // Home - Profile
        // Activity
        homeTextView = findViewById(R.id.home_tab)
        profileTextView = findViewById(R.id.profile_tab)
        homeTextView.setOnClickListener {
            // supportFragmentManager
            supportFragmentManager.beginTransaction()
                .replace(R.id.islami_fragment_container, HomeFragment())
                .addToBackStack("Home")
                .commit()
            // Chats - Status - Calls -> Chats
            supportFragmentManager.popBackStack("Home",1)
        }
        profileTextView.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.islami_fragment_container, ProfileFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}