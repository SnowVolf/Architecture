package ru.svolf.architectre.lesson5

import android.content.Context
import androidx.room.Room
import ru.svolf.architectre.App

class DbHelper(context: Context) {
    private var instance: DbHelper? = null
    private var employeesDatabase: EmployeesDatabase

    init {
        instance = this
        employeesDatabase = Room.databaseBuilder(context, EmployeesDatabase::class.java, "database").build()
    }

    fun getDb(): EmployeesDatabase {
        return employeesDatabase
    }
}