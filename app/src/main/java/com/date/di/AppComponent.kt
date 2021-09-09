package com.date.di

import com.date.MainActivity
import com.date.di.AppModule
import dagger.Component
import javax.inject.Singleton


@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun inject(activity: MainActivity)
}