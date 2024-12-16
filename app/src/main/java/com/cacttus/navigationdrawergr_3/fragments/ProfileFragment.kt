package com.cacttus.navigationdrawergr_3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cacttus.navigationdrawergr_3.databinding.HomeFragmentBinding
import com.cacttus.navigationdrawergr_3.databinding.ProfileFragmentBinding

class ProfileFragment : Fragment() {
    private lateinit var binding: ProfileFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //opsioni 1
//        return layoutInflater.inflate(R.layout.home_fragment, container, false)
        //opsioni 2
        binding = ProfileFragmentBinding.inflate(layoutInflater)
        return binding.root
    }
}