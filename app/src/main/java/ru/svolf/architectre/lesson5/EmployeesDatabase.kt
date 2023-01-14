package ru.svolf.architectre.lesson5

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.svolf.architectre.lesson5.dao.EmployeeDao
import ru.svolf.architectre.lesson5.entity.Employee

@Database(entities = [Employee::class], version = 1)
abstract class EmployeesDatabase : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDao?
}