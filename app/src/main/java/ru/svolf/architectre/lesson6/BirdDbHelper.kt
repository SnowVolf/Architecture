package ru.svolf.architectre.lesson6

import android.content.Context
import androidx.room.Room
import ru.svolf.architectre.lesson5.MainDatabase

/*
 * Created by SVolf on 17.01.2023, 17:55
 * This file is a part of "Architectre" project
 */
class BirdDbHelper(context: Context) {
    private var birdDatabase: BirdDatabase

    init {
        birdDatabase = Room.databaseBuilder(context, BirdDatabase::class.java, "bird_database").build()
    }

    fun getDb(): BirdDatabase {
        return birdDatabase
    }
}