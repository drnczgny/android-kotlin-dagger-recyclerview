package com.adrian.kotlinrecyclerviewdagger.main.di

import com.adrian.kotlinrecyclerviewdagger.main.MainActivity
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 07. 25..
 */

@Module
class MainModule(val mainActivity: MainActivity) {

    @ActivityScope
    @Provides
    fun provideMainActivity() = mainActivity

}