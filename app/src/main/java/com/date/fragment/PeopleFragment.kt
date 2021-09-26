package com.date.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.date.R
import com.date.databinding.FragmentPeopleBinding
import com.date.fragment.adapter.PeopleAdapter
import com.yuyakaido.android.cardstackview.CardStackLayoutManager

class PeopleFragment : Fragment() {
    private lateinit var binding: FragmentPeopleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_people, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cardStackVIew.layoutManager = CardStackLayoutManager(this.context)
        binding.cardStackVIew.adapter = PeopleAdapter()
    }
}