package com.route.islami_c39_gsun_wed.islamiApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import com.route.islami_c39_gsun_wed.R
import com.route.islami_c39_gsun_wed.databinding.ActivityHomeBinding
import com.route.islami_c39_gsun_wed.islamiApp.fragments.HadethFragment
import com.route.islami_c39_gsun_wed.islamiApp.fragments.QuranFragment
import com.route.islami_c39_gsun_wed.islamiApp.fragments.RadioFragment
import com.route.islami_c39_gsun_wed.islamiApp.fragments.TasbeehFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.islamiBottomNavigationView.setOnItemSelectedListener {
            if (it.itemId == R.id.navigation_quran) {
                pushFragment(QuranFragment())
            } else if (it.itemId == R.id.navigation_ahadeth) {
                pushFragment(HadethFragment())
            } else if (it.itemId == R.id.navigation_sebha) {
                pushFragment(TasbeehFragment())
            } else if (it.itemId == R.id.navigation_radio) {
                pushFragment(RadioFragment())
            }
            return@setOnItemSelectedListener true
        }
        binding.islamiBottomNavigationView.selectedItemId = R.id.navigation_quran
    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(binding.islamiAppFragmentContainer.id, fragment)
            .commit()
    }

}