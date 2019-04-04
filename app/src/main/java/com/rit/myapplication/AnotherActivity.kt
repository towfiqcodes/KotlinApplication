package com.rit.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import es.dmoral.toasty.Toasty
import java.util.*

class AnotherActivity : AppCompatActivity() {
    private val TAG: String = javaClass.simpleName

    lateinit var listView: ListView

    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        title = "Another Activity"
        textView = findViewById<TextView>(R.id.textView)
        controlFlow1()
        controlFlow2()
        basicSyntex()


    }

    private fun basicSyntex() {
        var result = "Country"
        textView.text = result

        //immutable variable
        /*val myValueOne="apple"
        val myValueThree:String
        myValueThree="Apple"*/
        //mutable variable
        /* var myValueTwo="apple"
         myValueTwo="orange"*/

        val countries: Array<String> =
            arrayOf(
                "Bangladesh",
                "India",
                "Pakistan",
                "SriLanka",
                "Bhutan",
                "Nepal",
                "Afganistan",
                "Maldives",
                "Japan",
                "Australia",
                "Malaysia"
            )
        listView = findViewById(R.id.listView)

        val adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, countries)

        listView.adapter = adapter


        listView.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                Toasty.success(this@AnotherActivity, "Bangladesh", Toast.LENGTH_SHORT).show()
            } else if (position == 1) {
                Toasty.success(this@AnotherActivity, "India", Toast.LENGTH_SHORT).show()
            } else if (position == 2) {
                Toasty.success(this@AnotherActivity, "Pakistan", Toast.LENGTH_SHORT).show()
            } else if (position == 3) {
                Toasty.success(this@AnotherActivity, "SriLanka", Toast.LENGTH_SHORT).show()
            } else if (position == 4) {
                Toasty.success(this@AnotherActivity, "Bhutan", Toast.LENGTH_SHORT).show()
            } else if (position == 5) {
                Toasty.success(this@AnotherActivity, "Nepal", Toast.LENGTH_SHORT).show()
            } else if (position == 6) {
                Toasty.success(this@AnotherActivity, "Afganistan", Toast.LENGTH_SHORT).show()
            } else if (position == 7) {
                Toasty.success(this@AnotherActivity, "Maldives", Toast.LENGTH_SHORT).show()
            }else if (position == 8) {
                Toasty.success(this@AnotherActivity, "Japan", Toast.LENGTH_SHORT).show()
            } else if (position == 9) {
                Toasty.success(this@AnotherActivity, "Australia", Toast.LENGTH_SHORT).show()
            } else if (position == 10) {
                Toasty.success(this@AnotherActivity, "Malaysia", Toast.LENGTH_SHORT).show()
            }else{
                Toasty.error(this@AnotherActivity, "Error Country", Toast.LENGTH_SHORT).show()

            }
        }


    }

    private fun controlFlow2() {
        /*var result = ""
      //for (i in 1..5){
         *//* if (i==3){
              break
          }
          if (i==3){
              continue
          }*//*

        outerLoop@for (i in 1..3){
              for (j in 1..4){
                  if (i==2 && j==2){
                      break@outerLoop
                  }
                  result+="i= "+i.toString()+" j= "+j.toString()+"\n"
              }
              textView.text=result
          }


      //}*/
    }

    private fun controlFlow1() {

        var result = ""


        /*for (index in 0..10) {
            result += index.toString() + "\n"
        }*/
        /*for (index in 10 downTo 0) {
            result += index.toString() + "\n"
        }*/
        /* for (index in 0..10 step 3  ) {
             result += index.toString() + "\n"
         }*/
        /*for (index in 10 downTo 0 step 3  ) {
            result += index.toString() + "\n"
        }*/
        /*for (index in 0 until 10  ) {
            result += index.toString() + "\n"
        }*/

        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val cities = arrayOf("Dhaka", "Kolkata")
        val countries = listOf<String>("Bangladesh", "India", "Srilanka", "Pakistan")
        /*for (index in 0..9){
            result+=numbers[index].toString()+"\n"
        }*/

        /* for (num in numbers){
             result+=num.toString()+"\n"
         }*/

        /*for(index in numbers.indices){
            result+=numbers[index].toString()+"\n"
          }*/

        /*for ((index,value) in numbers.withIndex()){
            result+="index :"+ "$index=$value\n"
        }*/

        /* for ((index, value)in countries.withIndex()){
             result+="index :"+ "$index=$value\n"
         }*/
        var index = 0
        /*while (index<10)
        {
            result+=index.toString()+"\n"
            index++
        }*/

        /*  do {
              result+=index.toString()+"\n"
              index+=2
          }while (index<10)

          textView.text = result*/
    }

}
