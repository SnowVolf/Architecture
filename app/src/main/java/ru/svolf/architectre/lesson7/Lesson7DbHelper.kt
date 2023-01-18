package ru.svolf.architectre.lesson7

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

/*
 * Created by SVolf on 18.01.2023, 22:12
 * This file is a part of "Architectre" project
 */
class Lesson7DbHelper(context: Context) {
    private var database: Lesson7Database

    init {
        database = Room.databaseBuilder(context, Lesson7Database::class.java, "lessons_db").build()
    }

    fun getDb(): Lesson7Database {
        return database
    }
}