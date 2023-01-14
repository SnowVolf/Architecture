package ru.svolf.architectre.lesson2

import androidx.lifecycle.MutableLiveData

class DataController {
    val data = MutableLiveData<Int>()

    companion object {
        var instance: DataController? = null
            get() {
                if (field == null) {
                    field = DataController()
                }
                return field
            }
            private set
    }
}