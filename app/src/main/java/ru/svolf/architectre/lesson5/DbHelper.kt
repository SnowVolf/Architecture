package ru.svolf.architectre.lesson5

import android.content.Context
import androidx.room.Room

class DbHelper(context: Context) {
    private var mainDatabase: MainDatabase

    init {
        mainDatabase = Room.databaseBuilder(context, MainDatabase::class.java, "database").build()
    }

    fun getDb(): MainDatabase {
        return mainDatabase
    }
}