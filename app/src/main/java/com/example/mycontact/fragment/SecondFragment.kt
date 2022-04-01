package com.example.mycontact.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.mycontact.R

class SecondFragment : Fragment() {

    private val arguments: SecondFragmentArgs by navArgs()
    private lateinit var passingName: TextView
    private lateinit var passingPhoneNumber: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        passingName = view.findViewById(R.id.name_passing_text_view)
        passingPhoneNumber = view.findViewById(R.id.phone_number_passing_text_view)
        val patchName = arguments.patch.name
        val patchPhoneNumber = arguments.patch.phoneNumber
        passingName.text = patchName
        passingPhoneNumber.text = patchPhoneNumber.toString()
    }

}