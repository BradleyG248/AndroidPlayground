package com.example.myapplication.services

import com.example.myapplication.store.Store

class AutoMinersService {
    private val store = Store()
    fun mineCheese(){
        store.mineCheese()
    }
    fun autoMine(){
        store.autoMine()
    }
}