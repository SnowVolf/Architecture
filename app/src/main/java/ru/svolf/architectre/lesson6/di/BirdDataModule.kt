package ru.svolf.architectre.lesson6.di

import dagger.Module
import dagger.Provides
import ru.svolf.architectre.App
import ru.svolf.architectre.lesson6.BirdDbHelper

/*
 * Created by SVolf on 17.01.2023, 17:54
 * This file is a part of "Architectre" project
 */
@Module
object BirdDataModule {
    @Provides
    fun getBirdData(): BirdDbHelper {
        return BirdDbHelper(App.getContext())
    }
}