package com.example.myapplication.store


import com.example.myapplication.models.AutoMiner


class Store {
    var functions = mutableMapOf<String, Function<Unit>>()
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
        functions["cheese"]
        }
    fun addAutoMiner(miner: AutoMiner){
        state.miners.add(miner)
        setCheesePerSecond()
        functions["miners"]
    }
    fun setCheesePerSecond(){
        var cps = 0
        state.miners.forEach{ miner -> cps+= miner.cheesePerSecond}
        state.cheesePerSecond = cps
    }
    fun autoMine(){
        state.cheese += state.cheesePerSecond

        functions["cheese"]

    }
    fun state(): state {
        return state
    }


    fun subscribe(key: String, fn: Function<Unit>){
        functions.put(key, fn)
    }

//    fun commit(key:String, value:Int) {
//        if (key == "cheese") {
//            state.cheese = value
//            functions[key]
//        } else if (key == "cps") {
//            state.cheesePerSecond = value
//            functions[key]
//        } else if (key == "cheesePerClick") {
//            state.cheesePerClick = value
//            functions[key]
//        }
//    }
//    fun commit(key:String, value:AutoMiner){
//            if(key == "miners"){
//                state.miners
//            }
//    }
}