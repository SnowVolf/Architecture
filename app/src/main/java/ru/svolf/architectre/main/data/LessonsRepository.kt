package ru.svolf.architectre.main.data

import ru.svolf.architectre.R

class LessonsRepository {
    private var lessonsList: ArrayList<LessonItem>? = null

    fun getLessons(): ArrayList<LessonItem>? {
        if (lessonsList == null) {
            lessonsList = ArrayList()
            lessonsList?.let {
                it.add(LessonItem().withId(R.id.action_goToLesson1).withTitle(R.string.lesson1_title))
                it.add(LessonItem().withId(R.id.action_goToLesson2).withTitle(R.string.lesson2_title))
                it.add(LessonItem().withId(R.id.action_goToLesson3).withTitle(R.string.lesson3_title))
                it.add(LessonItem().withId(R.id.action_goToLesson4).withTitle(R.string.lesson4_title))
                it.add(LessonItem().withId(R.id.action_goToLesson5).withTitle(R.string.lesson5_title))
            }
        }
        return lessonsList
    }
}