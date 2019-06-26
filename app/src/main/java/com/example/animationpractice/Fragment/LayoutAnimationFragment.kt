package com.example.animationpractice.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.animationpractice.Adapter.LayoutAnimationAdapter

import com.example.animationpractice.R
import kotlinx.android.synthetic.main.fragment_layout_animation.*

class LayoutAnimationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout_animation, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        recyclerView.adapter= LayoutAnimationAdapter()

        button_start.setOnClickListener {
            recyclerView.startLayoutAnimation()
        }

    }

}
