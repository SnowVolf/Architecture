package ru.svolf.architectre.main.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.IAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import ru.svolf.architectre.R
import ru.svolf.architectre.databinding.FragmentFirstBinding
import ru.svolf.architectre.main.data.LessonItem

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class LessonsListFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    val itemAdapter by lazy { ItemAdapter<LessonItem>() }
    val fastAdapter by lazy { FastAdapter.with(itemAdapter) }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lessonsList.adapter = fastAdapter
        if (itemAdapter.adapterItemCount == 0) {
            itemAdapter.add(
                LessonItem().withId(R.id.action_goToLesson1).withTitle(getString(R.string.lesson1_title)),
                LessonItem().withId(R.id.action_goToLesson2).withTitle(getString(R.string.lesson2_title)),
                LessonItem().withId(R.id.action_goToLesson3).withTitle(getString(R.string.lesson3_title)),
                LessonItem().withId(R.id.action_goToLesson4).withTitle(getString(R.string.lesson4_title))

            )
        }
        fastAdapter.onClickListener = { _: View?, _: IAdapter<LessonItem>, lessonItem: LessonItem, _: Int ->
            findNavController().navigate(lessonItem.getId())
            true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}