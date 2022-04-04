package com.example.mycontact

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontact.databinding.ItemUserBinding
import com.example.mycontact.fragment.FirstFragmentDirections

class UserAdapter(private val listContact : ArrayList<User>): RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    //    Class Holder
    class ViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
//        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
//        val phoneNumberTextView: TextView = itemView.findViewById(R.id.phone_number_text_view)
//        val detailButton: Button = itemView.findViewById(R.id.detail_button)
    }

    //    Membuat Holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
//        return ViewHolder(view)
    }

    //    Melakukan penetapan data yang akan ditampilkan pada setiap item/baris
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(listContact[position]){
                binding.nameTextView.text = this.name
                binding.phoneNumberTextView.text = this.phoneNumber.toString()
            }
        }
//        holder.nameTextView.text = listContact[position].name
//        holder.phoneNumberTextView.text = listContact[position].phoneNumber.toString()
        holder.binding.detailButton.setOnClickListener {
            val patchContact = User(
                listContact[position].name,
                listContact[position].phoneNumber
            )
            it.findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(patchContact))
        }
    }

    //    Memberitahu banyaknya list yang akan ditampilkan
    override fun getItemCount(): Int {
        return listContact.size
    }
}