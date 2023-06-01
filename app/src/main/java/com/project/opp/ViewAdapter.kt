package com.project.opp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.opp.databinding.ActivityDetailBinding
import com.project.opp.databinding.RecyclerRowBinding

class ViewAdapter(private val itemList: ArrayList<Admin>):
    RecyclerView.Adapter<ViewAdapter.AdminListViewHolder>() {

    class AdminListViewHolder( val binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdminListViewHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AdminListViewHolder(binding)


    }

    override fun getItemCount(): Int {
       return itemList.size
    }

    override fun onBindViewHolder(holder: AdminListViewHolder, position: Int) {
        holder.binding.imageView2.setImageResource(itemList[position].image)
        holder.binding.nameText.text=itemList[position].name

        holder.itemView.setOnClickListener(){
            val intent=Intent(holder.itemView.context,DetailActivity ::class.java)
            intent.putExtra("admin", itemList[position])
            holder.itemView.context.startActivity(intent)
        }
    }

}