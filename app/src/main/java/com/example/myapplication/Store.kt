package com.example.myapplication


import com.example.myapplication.models.AutoMiner

object state {
    var cheese = 0
        internal set
    var cheesePerClick = 0
        internal set
    var cheesePerSecond = 0
        internal set
    var miners = mutableListOf<AutoMiner>()
        internal set
}

class Store {

    fun mineCheese(){
            state.cheese += state.cheesePerClick
        }
    fun addAutoMiner(miner: AutoMiner){
            state.miners.add(miner)
        setCheesePerSecond()
    }
    fun setCheesePerSecond(){
        var cps = 0
        state.miners.forEach{miner -> cps+= miner.cheesePerSecond}
        state.cheesePerSecond = cps
    }
    fun autoMine(){
        state.cheese += state.cheesePerSecond
    }
    fun state(): state{
        return state
    }
}