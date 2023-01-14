package ru.svolf.architectre.lesson5.di

import dagger.Module
import dagger.Provides
import ru.svolf.architectre.App
import ru.svolf.architectre.lesson5.DbHelper

@Module
object DatabaseModule {

    @Provides
    fun provideDbHelper(): DbHelper {
        return DbHelper(App.getContext())
    }

}