package br.com.learning.android.currenttasks.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.learning.android.currenttasks.R
import br.com.learning.android.currenttasks.domain.models.Item

class ToDoListAdapter(
    private val context: Context,
    private val items: List<Item>
) : RecyclerView.Adapter<ToDoListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Item) {
            val title = itemView.findViewById<TextView>(R.id.titleTextView)
            title.text = item.title

            val description = itemView.findViewById<TextView>(R.id.descriptionItemTextView)
            description.text = item.description

            val icon = itemView.findViewById<ImageView>(R.id.icon_item)
            icon.setImageDrawable(item.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoListAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.to_do_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = items.size

}
