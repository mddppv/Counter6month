package com.example.counter6month

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var counter = 0
    private val _tvCount = MutableLiveData<Int>()
    val tvCount: LiveData<Int> = _tvCount

    fun dec() {
        _tvCount.value = --counter
    }

    fun inc() {
        _tvCount.value = ++counter
    }
}