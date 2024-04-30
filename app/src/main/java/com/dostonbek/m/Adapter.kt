package com.dostonbek.m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dostonbek.m.databinding.ItemServiceBinding


class Adapter(val list: ArrayList<Data>) :
    RecyclerView.Adapter<Adapter.Vh>() {
    inner class Vh(var binding: ItemServiceBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: Data) {
            binding.itemImage.setImageResource(data.image)
            binding.mainText.text = data.mainText
            binding.secondText.text = data.secondText


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemServiceBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }


}
