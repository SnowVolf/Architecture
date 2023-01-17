package ru.svolf.architectre.lesson6

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.svolf.architectre.lesson6.dao.BirdDao
import ru.svolf.architectre.lesson6.entity.Bird

/*
 * Created by SVolf on 17.01.2023, 18:05
 * This file is a part of "Architectre" project
 */
@Database(entities = [Bird::class], version = 1)
abstract class BirdDatabase : RoomDatabase() {

    abstract fun birdDao() : BirdDao


}