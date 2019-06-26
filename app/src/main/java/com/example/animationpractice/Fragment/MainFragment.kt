package com.example.animationpractice.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.animationpractice.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private lateinit var root : ViewGroup

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_main, container, false) as ViewGroup
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button_layoutanimation.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_layoutAnimationFragment)
        }

        button_animator.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_animatorFragment)
        }
    }
}
