package ru.svolf.architectre.main.data

import android.view.View
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.recyclerview.widget.RecyclerView
import com.mikepenz.fastadapter.items.AbstractItem
import ru.svolf.architectre.R

class LessonItem : AbstractItem<LessonItem.ViewHolder>() {
    @StringRes
    private var title: Int? = null

    /** The type of the Item. Can be a hardcoded INT, but preferred is a defined id */
    override val type: Int
        get() = R.id.item_container

    /** The layout for the given item */
    override val layoutRes: Int
        get() = R.layout.item_lesson

    fun withId(id: Int): LessonItem {
        this.identifier = id.toLong()
        return this
    }

    fun getId(): Int {
        return identifier.toInt()
    }

    fun withTitle(title: Int): LessonItem {
        this.title = title
        return this
    }

    override fun bindView(holder: ViewHolder, payloads: List<Any>) {
        super.bindView(holder, payloads)
        holder.title.setText(title!!)
    }

    override fun unbindView(holder: ViewHolder) {
        super.unbindView(holder)
        holder.title.text = null
    }

    /**
     * This method returns the ViewHolder for our item, using the provided View.
     *
     * @return the ViewHolder for this Item
     */
    override fun getViewHolder(v: View): ViewHolder {
        return ViewHolder(v)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val title = view.findViewById<TextView>(R.id.tv_title)
    }
}