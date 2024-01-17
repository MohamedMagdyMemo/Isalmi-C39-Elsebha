package com.route.islami_c39_gsun_wed.islamiApp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_gsun_wed.databinding.FragmentQuranBinding
import com.route.islami_c39_gsun_wed.islamiApp.adapter.SuraNameAdapter
import com.route.islami_c39_gsun_wed.islamiApp.model.SuraNameIndex
import com.route.islami_c39_gsun_wed.islamiApp.model.suraNamesList

class QuranFragment : Fragment() {
    private lateinit var binding: FragmentQuranBinding
    private lateinit var adapter: SuraNameAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuranBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val suraNameIndexList = suraNamesList.mapIndexed { index, suraName ->
            SuraNameIndex(suraName, index + 1)
        }

        adapter = SuraNameAdapter(suraNameIndexList)
        binding.suraNameIndexRecyclerView.adapter = adapter
    }

}
