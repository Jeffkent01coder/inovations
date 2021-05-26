package com.example.inovations

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.inovations.databinding.PersonItemBinding

class Adapter: RecyclerView.Adapter<Adapter.PersonViewHolder>() {

    inner class PersonViewHolder(person: PersonItemBinding):RecyclerView.ViewHolder(person.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder(PersonItemBinding.inflate(LayoutInflater.from(parent.context),parent, false))

    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {

    }
}