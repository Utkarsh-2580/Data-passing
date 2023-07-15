package com.example.datapassing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class fragment1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        val frag_text : TextView = view.findViewById(R.id.frag_text)

        val getvalue = arguments?.getString("key")
        frag_text.setText(getvalue)
        return view
    }


}