package ru.svolf.architectre.lesson5.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Employee {
    @PrimaryKey
    var id: Long? = null

    var name: String? = null

    var salary: Int? = null

}