package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.codeinglogs.navigationcomponent.databinding.FragmentChooseReceiverBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentHomeBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentSendCaseBinding


class SendCaseFragment : Fragment() {

    lateinit var Binding: FragmentSendCaseBinding

    val args:SendCaseFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentSendCaseBinding.inflate(layoutInflater,container,false)
        val navController=findNavController()
        val receiverName=args.receiverName

        Binding.etAmount.setText(SampleData.defaultAmount.value.toString())
        SampleData.defaultAmount.observe(viewLifecycleOwner){
            Binding.etAmount.setText(it.toString())
        }

        Binding.tvReceiver.text="Send case to ${receiverName}"
        Binding.btnSend.setOnClickListener {
            val action=SendCaseFragmentDirections.actionSendCaseFragmentToConfirmDialogFragment(receiverName,Binding.etAmount.text.toString())
            navController.navigate(action)
        }
        Binding.btnDone.setOnClickListener {
            val action=SendCaseFragmentDirections.actionSendCaseFragmentToHomeFragment()
            navController.navigate(action)
        }

        Binding.btnCancel.setOnClickListener {
            navController.popBackStack(R.id.homeFragment,false)
        }
        return  Binding.root
    }
}