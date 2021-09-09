package com.date

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.date.databinding.ActivityMainBinding
import com.date.fragment.LikeFragment
import com.date.fragment.MatchFragment
import com.date.fragment.PeopleFragment
import com.date.fragment.ProfileFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        val transactionan = supportFragmentManager.beginTransaction()
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.people -> {
                    val fragment = PeopleFragment()
                    transactionan.add(fragment, PeopleFragment::class.java.name)
                }
                R.id.like -> {
                    val fragment = LikeFragment()
                    transactionan.add(fragment, LikeFragment::class.java.name)
                }
                R.id.match -> {
                    val fragment = MatchFragment()
                    transactionan.add(fragment, MatchFragment::class.java.name)
                }
                R.id.profile -> {
                    val fragment = ProfileFragment()
                    transactionan.add(fragment, ProfileFragment::class.java.name)
                }
            }
            transactionan.commitNow()
            true
        }
    }
}