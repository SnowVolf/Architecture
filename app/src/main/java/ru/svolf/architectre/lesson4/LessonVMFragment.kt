package ru.svolf.architectre.lesson4

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import ru.svolf.architectre.R
import ru.svolf.architectre.databinding.FragmentLesson4VmBinding

class LessonVMFragment : Fragment() {

    companion object {
        fun newInstance() = LessonVMFragment()
    }

    private lateinit var viewModel: MyViewModel
    private val binding by lazy {
        FragmentLesson4VmBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MyViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val liveData = viewModel.getData()
        liveData?.observe(viewLifecycleOwner) {
            binding.tvValue.text =  it
        }
    }

}