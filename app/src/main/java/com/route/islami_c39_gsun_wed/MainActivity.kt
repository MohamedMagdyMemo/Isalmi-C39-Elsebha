package com.route.islami_c39_gsun_wed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.islami_c39_gsun_wed.databinding.ActivityMainBinding
import com.route.islami_c39_gsun_wed.fragments.HomeFragment
import com.route.islami_c39_gsun_wed.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // Assignment ->
    //          View Binding -> Contacts ->   Synchronization  

    // Sebha Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Whats App Tabs -> Chats - Status - Calls
        // Home - Profile
        // Activity
        // Data Binding ->

        binding.homeTab.setOnClickListener {
            // supportFragmentManager
            supportFragmentManager.beginTransaction()
                .replace(R.id.islami_fragment_container, HomeFragment())
                .addToBackStack("Home")
                .commit()
            // Chats - Status - Calls -> Chats
            supportFragmentManager.popBackStack("Home", 1)
        }
        binding.profileTab.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.islami_fragment_container, ProfileFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}