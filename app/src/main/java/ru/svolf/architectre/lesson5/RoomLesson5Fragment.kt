package ru.svolf.architectre.lesson5

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import ru.svolf.architectre.App
import ru.svolf.architectre.R
import javax.inject.Inject

class RoomLesson5Fragment : Fragment() {

    companion object {
        fun newInstance() = RoomLesson5Fragment()
    }

    private lateinit var viewModel: Room5ViewModel
    @Inject
    lateinit var databaseHelper: DbHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_room5, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Room5ViewModel::class.java)
        // TODO: Use the ViewModel
        (context?.applicationContext as App).appComponent.injectDependecncy(this)

        val dao = databaseHelper.getDb().employeeDao()
        if (dao != null) {
            Toast.makeText(context, "Ebat rabotaet", Toast.LENGTH_LONG).show()
        }
    }

}