package com.rit.myapplication

import android.content.Intent
import android.net.sip.SipSession
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myfunction()



    }

    private fun myfunction() {
        var button1 = findViewById<Button>(R.id.btnHello1)
        var button2 = findViewById<Button>(R.id.btnHello2)
        var button3 = findViewById<Button>(R.id.btnHello3)
        var button4 = findViewById<Button>(R.id.btnHello4)

        var listener: View.OnClickListener = View.OnClickListener { view ->

            var textView: TextView = findViewById<TextView>(R.id.tvHello)
            var button: Button = view as Button
            var id = view.id

            /* if (id == R.id.btnHello1) {
                textView.text = "You Clicked: " + button.text
            }else if (id==R.id.btnHello2){
               textView.text = "You Clicked: " + button.text

            }else if (id==R.id.btnHello3){
                textView.text = "You Clicked: " + button.text

            }else{
                textView.text = "You Clicked wrong button "

    }*/

            when (id) {
                R.id.btnHello1 ->startActivity(Intent(this@MainActivity, AnotherActivity::class.java))

                R.id.btnHello2 -> textView.text = "You Won the Prize"
                R.id.btnHello3 -> textView.text = "Worng button ? You Pressed" + button.text
                else -> {
                    textView.text = "You lost."

                }
            }
        }
        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
        button3.setOnClickListener(listener)
        button4.setOnClickListener(listener)
        }

}
