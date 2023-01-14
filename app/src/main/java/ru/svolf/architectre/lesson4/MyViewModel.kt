package ru.svolf.architectre.lesson4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private var data: MutableLiveData<String>? = null

    fun getData(): LiveData<String?>? {
        if (data == null) {
            data = MutableLiveData()
            loadData()
        }
        return data
    }

    private fun loadData() {
        data?.postValue(System.currentTimeMillis().toString())
    }
}