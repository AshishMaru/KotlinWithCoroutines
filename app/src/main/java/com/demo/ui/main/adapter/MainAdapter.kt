package com.demo.ui.main.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.demo.R
import com.demo.data.model.Restaurants
import com.demo.ui.main.adapter.MainAdapter.DataViewHolder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.item_layout.view.*


class MainAdapter(private val restaurants: ArrayList<Restaurants.Venue>) : RecyclerView.Adapter<DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bind(vanues: Restaurants.Venue) {
            itemView.apply {
                textViewUserName.text = vanues.name
                textViewUserEmail.text = vanues.location!!.address
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount(): Int = restaurants.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        var vanues = restaurants[position]

        holder.bind(vanues)


        holder.itemView.dislikeBtn.setOnClickListener {
            it.startAnimation(AnimationUtils.loadAnimation(it.context, R.anim.img_click));
            notifyItemRemoved(position)
            Snackbar.make(holder.itemView,holder.itemView.context.getString(R.string.you_dont_like_it_dont_worry_we_will_find_more),Snackbar.LENGTH_LONG).show()


        }
        holder.itemView.mapBtn.setOnClickListener {
            it.startAnimation(AnimationUtils.loadAnimation(it.context, R.anim.img_click));

            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?saddr=${vanues.location!!.lat},${vanues.location!!.lng}&daddr=20.5666,45.345")
            )
            holder.itemView.context.startActivity(intent)

        }
    }

    fun addUsers(restaurants: List<Restaurants.Venue>) {
        this.restaurants.apply {
            clear()
            addAll(restaurants)
        }

    }
}