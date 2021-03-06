package com.nerostarx.milkystore.ui.cart

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import com.nerostarx.milkystore.R
import com.nerostarx.milkystore.adapters.CartAdapter
import com.nerostarx.milkystore.databinding.CartFragmentBinding

class CartFragment : Fragment() {

    private val viewModel: CartViewModel by activityViewModels()
    private lateinit var binding: CartFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = CartFragmentBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()
        binding.checkoutButton.setOnClickListener {}
    }

    private fun initRecycler() {
        val recycler = binding.cartItemsRecycler

        recycler.setHasFixedSize(false)
        recycler.layoutManager = LinearLayoutManager(requireContext()
            ,VERTICAL,false)
        recycler.adapter = CartAdapter()
    }
}