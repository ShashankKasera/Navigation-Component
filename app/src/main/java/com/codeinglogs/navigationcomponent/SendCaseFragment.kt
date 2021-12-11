package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.codeinglogs.navigationcomponent.databinding.FragmentChooseReceiverBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentHomeBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentSendCaseBinding


class SendCaseFragment : Fragment(R.layout.fragment_send_case) {

    lateinit var Binding: FragmentSendCaseBinding

    val args:SendCaseFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentSendCaseBinding.inflate(layoutInflater,container,false)
        val receiverName=args.receiverName
        Binding.tvReceiver.text="Send case to ${receiverName}"
        return  Binding.root
    }
}