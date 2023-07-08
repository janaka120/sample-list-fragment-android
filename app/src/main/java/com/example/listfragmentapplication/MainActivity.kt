package com.example.listfragmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransition: FragmentTransaction = fragmentManager.beginTransaction()
        val myListFragment = MyListFragment()
        fragmentTransition.add(R.id.frame, myListFragment)
        fragmentTransition.commit()
    }
}