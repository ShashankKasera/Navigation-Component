package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codeinglogs.navigationcomponent.databinding.FragmentChooseReceiverBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentViewBalanceBinding


class ViewBalanceFragment : Fragment(R.layout.fragment_view_balance) {

    lateinit var Binding: FragmentViewBalanceBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentViewBalanceBinding.inflate(layoutInflater,container,false)


        return  Binding.root
    }

}