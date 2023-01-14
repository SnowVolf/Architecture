package ru.svolf.architectre.main.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.svolf.architectre.main.data.LessonItem
import ru.svolf.architectre.main.data.LessonsRepository

class LessonsViewModel : ViewModel() {
    private var liveData: MutableLiveData<List<LessonItem>>? = null

    fun getLessons(): LiveData<List<LessonItem>> {
        if (liveData == null) {
            liveData = MutableLiveData()
            liveData?.value = LessonsRepository().getLessons()
        }
        return liveData!!
    }

}