package com.abuzaio.livedataarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        viewModel.name.postValue("Abu Aziz")

        val nameObserver = Observer<String> { name -> tv_home.text = name }
        viewModel.name.observe(this, nameObserver)
    }
}