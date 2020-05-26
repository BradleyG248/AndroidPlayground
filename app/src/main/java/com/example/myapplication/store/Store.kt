package com.example.myapplication.store


import com.example.myapplication.models.AutoMiner


class Store {
    companion object state {
        var cheese = 0
            private set
        var cheesePerClick = 1
            private set
        var cheesePerSecond = 1
            private set
        var miners = mutableListOf<AutoMiner>()
            private set
    }

    fun mineCheese(){
            state.cheese += state.cheesePerClick
        }
    fun addAutoMiner(miner: AutoMiner){
            state.miners.add(miner)
        setCheesePerSecond()
    }
    fun setCheesePerSecond(){
        var cps = 0
        state.miners.forEach{ miner -> cps+= miner.cheesePerSecond}
        state.cheesePerSecond = cps
    }
    fun autoMine(){
        state.cheese += state.cheesePerSecond
    }
    fun state(): state {
        return state
    }

    var functions = mutableListOf(fun)
}