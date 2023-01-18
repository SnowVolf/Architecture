package ru.svolf.architectre.lesson7.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/*
 * Created by SVolf on 18.01.2023, 22:16
 * This file is a part of "Architectre" project
 */
@Entity
abstract class Lesson7Object {

    @PrimaryKey
    var id: Long? = null

    var title: String? = null

    var description: String? = null

}