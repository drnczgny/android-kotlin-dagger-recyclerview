package com.adrian.kotlinrecyclerviewdagger.main

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adrian.kotlinrecyclerviewdagger.R
import com.adrian.kotlinrecyclerviewdagger.main.di.MainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        MainComponent.Injector.buildComponent(this).inject(this);

        sharedPreferences.toString()
    }
}
