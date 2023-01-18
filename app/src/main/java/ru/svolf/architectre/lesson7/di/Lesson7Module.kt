package ru.svolf.architectre.lesson7.di

import dagger.Module
import dagger.Provides
import ru.svolf.architectre.App
import ru.svolf.architectre.lesson7.Lesson7DbHelper
import ru.svolf.architectre.lesson7.entity.Lesson7Object

/*
 * Created by SVolf on 18.01.2023, 22:30
 * This file is a part of "Architectre" project
 */
@Module
object Lesson7Module {
     @Provides
     fun provideLessonsData(): Lesson7DbHelper {
          return Lesson7DbHelper(App.getContext())
     }
}