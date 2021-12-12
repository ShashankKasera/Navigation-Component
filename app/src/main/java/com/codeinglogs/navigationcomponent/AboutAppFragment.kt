package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codeinglogs.navigationcomponent.databinding.FragmentAboutAppBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentChooseReceiverBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentSettingBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentViewBalanceBinding


class AboutAppFragment : Fragment() {

    lateinit var Binding: FragmentAboutAppBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentAboutAppBinding.inflate(layoutInflater,container,false)
        val navController=findNavController()


         return  Binding.root
    }

}