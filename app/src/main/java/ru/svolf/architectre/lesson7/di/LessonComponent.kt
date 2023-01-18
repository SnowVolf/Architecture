package ru.svolf.architectre.lesson7.di

import dagger.Component
import ru.svolf.architectre.lesson7.Lesson7DbHelper

/*
 * Created by SVolf on 18.01.2023, 22:39
 * This file is a part of "Architectre" project
 */
@Component(modules = [Lesson7Module::class])
interface LessonComponent {
    fun inject(): Lesson7DbHelper
}