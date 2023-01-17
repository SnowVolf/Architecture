package ru.svolf.architectre.lesson6.dao

import androidx.room.*
import ru.svolf.architectre.lesson6.entity.Bird

/*
 * Created by SVolf on 17.01.2023, 17:14
 * This file is a part of "Architectre" project
 */
@Dao
interface BirdDao {

    @Query("SELECT * FROM Birds")
    fun getAll(): List<Bird>

    @Delete
    fun delete(bird: Bird)

    @Insert
    fun insert(bird: Bird)

}