package ru.svolf.architectre.lesson5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.svolf.architectre.App
import ru.svolf.architectre.databinding.FragmentRoom5Binding
import ru.svolf.architectre.lesson5.entity.Employee
import javax.inject.Inject

class RoomLesson5Fragment : Fragment() {
    val binding by lazy { FragmentRoom5Binding.inflate(layoutInflater) }
    val employeeDao by lazy { databaseHelper.getDb().employeeDao() }

    companion object {
        fun newInstance() = RoomLesson5Fragment()
    }

    private lateinit var viewModel: Room5ViewModel
    @Inject
    lateinit var databaseHelper: DbHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View
       = binding.root


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Room5ViewModel::class.java)
        // TODO: Use the ViewModel
        (context?.applicationContext as App).appComponent.injectDependency(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonStore.setOnClickListener {
            val id = binding.fieldId.text.toString().toLong()
            val name = binding.fieldName.text.toString()
            val salary = binding.filedSalary.text.toString().toInt()
            CoroutineScope(Dispatchers.IO).launch {
                val employee = Employee().apply {
                    this.id = id
                    this.name = name
                    this.salary = salary
                }
                employeeDao.insert(employee)

            }
            Toast.makeText(context, "User with ID $id has been inserted", Toast.LENGTH_SHORT).show()
        }

        binding.buttonFill.setOnClickListener {
            val id = binding.filedGetid.text.toString().toLong()
            CoroutineScope(Dispatchers.IO).launch {
                employeeDao.getById(id)?.let {
                    withContext(Dispatchers.Main) {
                        binding.fieldId.setText(it.id.toString())
                        binding.fieldName.setText(it.name.toString())
                        binding.filedSalary.setText(it.salary.toString())
                    }
                }
            }

        }
    }

}