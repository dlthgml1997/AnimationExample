package com.example.animationpractice

import android.os.Bundle
import androidx.navigation.NavArgs

class AnimatorFragmentArgs(val duration: Long = 300L) : NavArgs {

    fun toBundle() : Bundle {
        val result = Bundle()
        result.putLong("duration",this.duration)
        return result
    }

    companion object{
        @JvmStatic
        fun fromBundle(bundle: Bundle): AnimatorFragmentArgs {
            bundle.setClassLoader(AnimatorFragmentArgs::class.java.classLoader)
            val __duration: Long
          //  if(bundle.containsKey())
        }

    }
}
