package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codeinglogs.navigationcomponent.databinding.FragmentViewBalanceBinding
import com.codeinglogs.navigationcomponent.databinding.FragmentViewTransactionBinding


class ViewTransactionFragment : Fragment() {


    lateinit var Binding: FragmentViewTransactionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentViewTransactionBinding.inflate(layoutInflater,container,false)


        return  Binding.root
    }
}