package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codeinglogs.navigationcomponent.databinding.FragmentChooseReceiverBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentSettingBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentViewBalanceBinding


class SettingFragment : Fragment(R.layout.fragment_setting) {

    lateinit var Binding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentSettingBinding.inflate(layoutInflater,container,false)
        val navController=findNavController()

        Binding.etDefaultAmount.setText(SampleData.defaultAmount.value.toString())

        Binding.btnSaveDefaultAmount.setOnClickListener {
            val defaultAmount = Binding.etDefaultAmount.text.toString().toLong()
            SampleData.defaultAmount.value = defaultAmount
        }

        Binding.btnAboutApp.setOnClickListener {
            val action =SettingFragmentDirections.actionGlobalAboutAppFragment()
            navController.navigate(action)
        }
         return  Binding.root
    }

}