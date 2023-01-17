package ru.svolf.architectre

import android.app.Application
import android.content.Context
import ru.svolf.architectre.lesson5.di.DaggerAppComponent
import ru.svolf.architectre.lesson6.di.BirdComponent
import ru.svolf.architectre.lesson6.di.DaggerBirdComponent

class App : Application() {
    val appComponent = DaggerAppComponent.create()
    val birdComponent = DaggerBirdComponent.create()

    override fun onCreate() {
        super.onCreate()
        context = this
    }

    companion object {
        @JvmStatic
        private var context: Context? = null

        @JvmStatic
        fun getContext(): Context {
            return context!!
        }
    }
}