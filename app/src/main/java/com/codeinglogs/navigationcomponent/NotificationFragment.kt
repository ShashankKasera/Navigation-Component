package com.codeinglogs.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codeinglogs.navigationcomponent.databinding.*


class NotificationFragment : Fragment() {

    lateinit var Binding: FragmentNotificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = FragmentNotificationBinding.inflate(layoutInflater,container,false)
        val navController=findNavController()

        Binding.ListView.adapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,getNotifications())
         return  Binding.root
    }

    private fun getNotifications():List<String>{
        val notifications = mutableListOf<String>()

        for(i in 1..20){
            notifications.add("Notification # $i")
        }
        return notifications
    }

}