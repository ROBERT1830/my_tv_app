package com.robertconstantindinescu.mytvapp.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.robertconstantindinescu.mytvapp.R

/**
 * Loads [MainFragment].
 */
class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}