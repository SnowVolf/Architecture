package ru.svolf.architectre.lesson4

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class MyViewModelFactory : ViewModelProvider.NewInstanceFactory {
    private var id: Long

    constructor(id: Long) {
        this.id = id
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == MyViewModel::class.java){
            return MyViewModel(id) as T
        } else
            return super.create(modelClass)
    }
}