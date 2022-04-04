package com.example.mycontact.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.mycontact.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    private val args: SecondFragmentArgs by navArgs()
//    private lateinit var passingName: TextView
//    private lateinit var passingPhoneNumber: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
//        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val passingName = args.patch.name
        val passingPhoneNumber = args.patch.phoneNumber

        binding.namePassingTextView.text = passingName
        binding.phoneNumberPassingTextView.text = passingPhoneNumber.toString()

//        passingName = view.findViewById(R.id.name_passing_text_view)
//        passingPhoneNumber = view.findViewById(R.id.phone_number_passing_text_view)
//        val patchName = arguments.patch.name
//        val patchPhoneNumber = arguments.patch.phoneNumber
//        passingName.text = patchName
//        passingPhoneNumber.text = patchPhoneNumber.toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}