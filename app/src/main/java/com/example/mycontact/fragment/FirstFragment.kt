package com.example.mycontact.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontact.R
import com.example.mycontact.User
import com.example.mycontact.UserAdapter

class FirstFragment : Fragment() {

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listContact = arrayListOf(
            User("Ridwan",+6281345453636),
            User("Riki", +6281345453636 ),
            User("Riski", +6281345453636),
            User("Rian", +6281345453636),
            User("Radit", +6281345453636)
        )

        recyclerView = view.findViewById(R.id.rv_first_fragment)
        val userAdapter = UserAdapter(listContact)
        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = userAdapter



    }

}