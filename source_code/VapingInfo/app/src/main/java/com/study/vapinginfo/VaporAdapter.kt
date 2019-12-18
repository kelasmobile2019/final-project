package com.study.vapinginfo

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class VaporAdapter(
    private val listVape: ArrayList<Vapor>,
    private val activity: Activity
): RecyclerView.Adapter<VaporAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var vapePhoto: ImageView = itemView.findViewById(R.id.img_items)
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_vape, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listVape.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val vapor = listVape[position]

        Glide.with(holder.itemView.context).load(vapor.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.vapePhoto)

        holder.tvName.text = vapor.name
        holder.tvDetail.text = vapor.details

        holder.itemView.setOnClickListener{
            val moveToDetailIntent = Intent(activity, DetailActivity::class.java)
            //moveToDetailIntent.putExtra(DetailActivity.PHOTO_KEY, vapor)
            moveToDetailIntent.putExtra(DetailActivity.PHOTO_KEY, vapor)
            activity.startActivity(moveToDetailIntent)
        }
    }
}