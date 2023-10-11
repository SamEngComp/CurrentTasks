package br.com.learning.android.currenttasks.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.learning.android.currenttasks.R
import br.com.learning.android.currenttasks.domain.models.Item
import br.com.learning.android.currenttasks.ui.recyclerview.adapter.ToDoListAdapter

class MainActivity: AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val toDoRecyclerView = findViewById<RecyclerView>(R.id.toDoRecyclerView)
        toDoRecyclerView.adapter = ToDoListAdapter(this, listOf(
            Item("Title 1", "Description 1", null),
            Item("Title 2", "Description 2", null),
            Item("Title 3", "Description 3", null)
        ))
        toDoRecyclerView.layoutManager = LinearLayoutManager(this)
    }

}