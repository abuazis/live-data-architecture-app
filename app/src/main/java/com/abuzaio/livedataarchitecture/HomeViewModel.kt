package com.abuzaio.livedataarchitecture

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    val name: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}