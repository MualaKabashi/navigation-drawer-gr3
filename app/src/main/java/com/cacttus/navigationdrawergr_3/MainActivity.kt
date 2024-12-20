package com.cacttus.navigationdrawergr_3

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.cacttus.navigationdrawergr_3.databinding.ActivityMainBinding
import com.cacttus.navigationdrawergr_3.fragments.HomeFragment
import com.cacttus.navigationdrawergr_3.fragments.ProfileFragment
import com.cacttus.navigationdrawergr_3.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var homeFragment: HomeFragment
    private lateinit var profileFragment: ProfileFragment
    private lateinit var settingsFragment: SettingsFragment
    private lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeFragments()
        initToggle()

    }

    fun initializeFragments() {
        homeFragment = HomeFragment()
        profileFragment = ProfileFragment()
        settingsFragment = SettingsFragment()
    }

    fun initToggle() {
        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

}
