package ru.svolf.architectre.lesson5.dao

import androidx.room.*
import ru.svolf.architectre.lesson5.entity.Employee

@Dao
interface EmployeeDao {
    @Query("SELECT * FROM employee")
    fun getAll(): MutableList<Employee?>?

    @Query("SELECT * FROM employee WHERE id = :id")
    fun getById(id: Long): Employee?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(employee: Employee)

    @Update
    fun update(employee: Employee)

    @Delete
    fun delete(employee: Employee)
}