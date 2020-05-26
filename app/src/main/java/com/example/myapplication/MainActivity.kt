package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.controllers.AutoMinersController
import com.example.myapplication.store.Store
import java.util.*
import kotlin.concurrent.scheduleAtFixedRate

class MainActivity : AppCompatActivity() {
    val store = Store()
    val controller = AutoMinersController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timer("settingUp", false).scheduleAtFixedRate(0, 1000){autoMine()}
    }
    fun click(view: View) {
        controller.mineCheese()
    }
    fun autoMine(){
        controller.autoMine()
    }
    fun drawCheese(){
        val message: String = "" + store.state().cheese + " cheese"
        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(message)
    }
}
