package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.codeinglogs.navigationcomponent.databinding.FragmentChooseReceiverBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentConfirmDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ConfirmDialogFragment : BottomSheetDialogFragment() {

    lateinit var Binding:FragmentConfirmDialogBinding
    val args:ConfirmDialogFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentConfirmDialogBinding.inflate(layoutInflater,container,false)

        val receiverName=args.receiverName
        val amount=args.amount

        Binding.tvMessage.text="Do you want to send ${amount} to ${receiverName}"

        Binding.btnYes.setOnClickListener {
            Toast.makeText(requireContext(),"Do you want to send ${amount} to ${receiverName}",Toast.LENGTH_LONG).show()
            dismiss()
        }
        Binding.btnNo.setOnClickListener {
            dismiss()
        }
        return  Binding.root
    }

}