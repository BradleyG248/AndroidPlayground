package com.example.myapplication.models

class AutoMiner {
    var cheesePerSecond = 0
    private set
    var name = ""
    private set
    var description = ""
    private set
    constructor(CPS: Int, Name: String, desc: String){
        cheesePerSecond = CPS
        name = Name
        description = desc
    }
}