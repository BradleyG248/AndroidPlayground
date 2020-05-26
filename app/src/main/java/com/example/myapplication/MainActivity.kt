package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.controllers.AutoMinersController
import com.example.myapplication.Store

class MainActivity : AppCompatActivity() {
    val controller = AutoMinersController()
    val store = Store()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun click(view: View) {
        val message: String = "" + store.state().cheese + " cheese"
        controller.mineCheese()
        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(message)
    }

}
