package ru.svolf.architectre.lesson5.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/*
 * Created by SVolf on 17.01.2023, 15:38
 * This file is a part of "Architectre" project
 */
@Entity(tableName = "Car")
class Car {
    @PrimaryKey
    var id: Long? = null

    var model: String? = null

    var year: Int? = null
}