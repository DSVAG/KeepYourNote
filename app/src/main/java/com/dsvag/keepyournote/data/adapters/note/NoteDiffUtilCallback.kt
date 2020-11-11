package com.dsvag.keepyournote.data.adapters.note

import androidx.recyclerview.widget.DiffUtil
import com.dsvag.keepyournote.data.models.Note

class NoteDiffUtilCallback(
    private val oldList: List<Note>,
    private val newList: List<Note>,
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}