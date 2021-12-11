package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.codeinglogs.navigationcomponent.databinding.FragmentChooseReceiverBinding


class ChooseReceiverFragment : Fragment(R.layout.fragment_choose_receiver) {

    lateinit var Binding:FragmentChooseReceiverBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentChooseReceiverBinding.inflate(layoutInflater,container,false)

        val  navController= findNavController()
        Binding.btnNext.setOnClickListener {
            val receiverName=Binding.etReceiverName.text.toString()
            val action=ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCaseFragment(receiverName)
            navController.navigate(action)
        }

        Binding.btnCancel.setOnClickListener {
            navController.popBackStack()
        }

        return  Binding.root
    }

}