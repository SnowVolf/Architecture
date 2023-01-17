package ru.svolf.architectre.lesson6.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/*
 * Created by SVolf on 17.01.2023, 16:39
 * This file is a part of "Architectre" project
 */
@Entity(tableName = "Birds")
data class Bird(@PrimaryKey @ColumnInfo("IDs") var id: Long, @ColumnInfo("Species") var type: String, @ColumnInfo("Name") var name: String)