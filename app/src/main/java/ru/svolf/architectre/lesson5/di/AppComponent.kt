package ru.svolf.architectre.lesson5.di

import dagger.Component
import ru.svolf.architectre.lesson5.RoomLesson5Fragment

@Component(modules = [DatabaseModule::class])
interface AppComponent {
    fun injectDependency(fragment: RoomLesson5Fragment)
}