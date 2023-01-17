package ru.svolf.architectre.lesson6.di

import dagger.Component
import ru.svolf.architectre.lesson6.BirdDbHelper

/*
 * Created by SVolf on 17.01.2023, 18:17
 * This file is a part of "Architectre" project
 */
@Component(modules = [BirdDataModule::class])
interface BirdComponent {
    fun inject(): BirdDbHelper
}