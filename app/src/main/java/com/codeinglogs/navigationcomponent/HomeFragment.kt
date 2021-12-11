package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codeinglogs.navigationcomponent.databinding.FragmentChooseReceiverBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var Binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        val  navController= findNavController()
        Binding.btnSendMoney.setOnClickListener {
            val  action=HomeFragmentDirections.actionHomeFragmentToChooseReceiverFragment()
            navController.navigate(action)
        }
        Binding.btnTransactions.setOnClickListener {
            val  action=HomeFragmentDirections.actionHomeFragmentToViewTransactionFragment()
            navController.navigate(action)
        }
        Binding.btnViewBalance.setOnClickListener {
            val  action=HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            navController.navigate(action)
        }
        return  Binding.root
    }
}