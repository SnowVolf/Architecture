package ru.svolf.architectre.lesson7

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.svolf.architectre.lesson7.dao.Lesson7Dao
import ru.svolf.architectre.lesson7.entity.Lesson7Object

/*
 * Created by SVolf on 18.01.2023, 22:13
 * This file is a part of "Architectre" project
 */
@Database([Lesson7Object::class], version = 1)
abstract class Lesson7Database : RoomDatabase() {
    abstract fun lessonDao(): Lesson7Dao
}