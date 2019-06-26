package com.example.animationpractice.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.animationpractice.AnimatorFragmentArgs

import com.example.animationpractice.R

class AnimatorFragment : Fragment() {

    companion object {
        const val DEFAULT_DURATION = 300L
    }

    private val args by navArgs<AnimatorFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animator, container, false)
    }


}
