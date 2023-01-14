package ru.svolf.architectre.lesson5.di

import dagger.Component
import ru.svolf.architectre.lesson5.DbHelper
import ru.svolf.architectre.lesson5.RoomLesson5Fragment

@Component(modules = [DatabaseModule::class])
interface AppComponent {
    fun injectDependecncy(fragment: RoomLesson5Fragment)
}