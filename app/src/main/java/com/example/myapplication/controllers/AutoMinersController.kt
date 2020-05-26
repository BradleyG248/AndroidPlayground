package com.example.myapplication.controllers

import com.example.myapplication.services.AutoMinersService


class AutoMinersController {
    private val service = AutoMinersService()
    fun mineCheese(){
        service.mineCheese()
    }
    fun autoMine(){
        service.autoMine()
    }
}