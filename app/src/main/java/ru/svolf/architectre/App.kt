package ru.svolf.architectre

import android.app.Application
import android.content.Context
import ru.svolf.architectre.lesson5.di.DaggerAppComponent

class App : Application() {
    val appComponent = DaggerAppComponent.create()

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