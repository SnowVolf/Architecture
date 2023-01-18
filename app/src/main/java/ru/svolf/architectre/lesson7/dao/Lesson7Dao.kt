package ru.svolf.architectre.lesson7.dao

import androidx.room.*
import ru.svolf.architectre.lesson7.entity.Lesson7Object

/*
 * Created by SVolf on 18.01.2023, 22:14
 * This file is a part of "Architectre" project
 */
@Dao
interface Lesson7Dao {

    @Query("SELECT * FROM Lessons")
    fun getAll(): List<Lesson7Object>

    @Insert
    fun add(lessons: List<Lesson7Object>): Long

    @Delete
    fun delete(lessons: List<Lesson7Object>): Long
}