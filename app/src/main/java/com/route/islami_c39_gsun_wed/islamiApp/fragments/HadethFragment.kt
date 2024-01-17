package com.route.islami_c39_gsun_wed.islamiApp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_gsun_wed.databinding.FragmentAhadethBinding
import com.route.islami_c39_gsun_wed.databinding.FragmentQuranBinding

class HadethFragment : Fragment() {
    lateinit var binding: FragmentAhadethBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAhadethBinding.inflate(inflater)
        return binding.root
    }

}
