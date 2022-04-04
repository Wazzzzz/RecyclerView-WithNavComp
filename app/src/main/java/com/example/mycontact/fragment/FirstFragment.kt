package com.example.mycontact.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontact.User
import com.example.mycontact.UserAdapter
import com.example.mycontact.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
//    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
//        return inflater.inflate(R.layout.fragment_first, container, false)
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


        val userAdapter = UserAdapter(listContact)
        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvFirstFragment.layoutManager = layoutManager
        binding.rvFirstFragment.adapter = userAdapter



    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}