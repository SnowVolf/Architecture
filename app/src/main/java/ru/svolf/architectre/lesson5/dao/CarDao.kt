package ru.svolf.architectre.lesson5.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import ru.svolf.architectre.lesson5.entity.Car

/*
 * Created by SVolf on 17.01.2023, 15:46
 * This file is a part of "Architectre" project
 */
@Dao
interface CarDao {
     @Query("SELECT * FROM car")
     fun getAll(): MutableList<Car>

     @Update
     fun update(car: Car)

     @Delete
     fun delete(car: Car)

}