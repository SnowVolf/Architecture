package ru.svolf.architectre.lesson5

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.svolf.architectre.lesson5.dao.CarDao
import ru.svolf.architectre.lesson5.dao.EmployeeDao
import ru.svolf.architectre.lesson5.entity.Car
import ru.svolf.architectre.lesson5.entity.Employee

@Database(entities = [Employee::class, Car::class], version = 1)
abstract class MainDatabase : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDao
    abstract fun carDao(): CarDao
}