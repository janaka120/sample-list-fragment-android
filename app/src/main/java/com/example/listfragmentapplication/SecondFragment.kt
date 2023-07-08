package com.example.listfragmentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class SecondFragment : Fragment() {
    lateinit var imageView : ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View =  inflater.inflate(R.layout.fragment_second, container, false)
        imageView = view.findViewById(R.id.imageView)
        val position = arguments?.getInt("position", 0)
        when(position) {
            0 -> imageView.setImageResource(R.drawable.colombo)
            1 -> imageView.setImageResource(R.drawable.marine_parade)
            2 -> imageView.setImageResource(R.drawable.berlin)
            3 -> imageView.setImageResource(R.drawable.auckland)
            4 -> imageView.setImageResource(R.drawable.stockholm)
        }
        // Inflate the layout for this fragment
        return view
    }
}