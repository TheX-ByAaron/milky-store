package com.nerostarx.milkystore.ui.history

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.nerostarx.milkystore.adapters.HistoryAdapter
import com.nerostarx.milkystore.databinding.HistoryFragmentBinding

class HistoryFragment : Fragment() {

    private val viewModel: HistoryViewModel by activityViewModels()
    private lateinit var binding: HistoryFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = HistoryFragmentBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()
    }

    private fun initRecycler() {
        val recycler = binding.historyRecycler

        recycler.setHasFixedSize(false)
        recycler.layoutManager = LinearLayoutManager(requireContext()
            , LinearLayoutManager.VERTICAL,false)
        recycler.adapter = HistoryAdapter()
    }
}