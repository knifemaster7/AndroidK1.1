package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.util.Log.d
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        startButton.setOnClickListener {
            var quetions = arrayListOf<String>("Siapa nama presiden pertama Israel?", "Penemu Listrik?", "Ibu Korea Selatan?",
                "Nama Capres No Urut 2?", "Nama Wakil Presiden SBY Terakhir?", "Takjil khas puasa", "Ibu Kota Inggris?", "Pahlawan Tanpa Tanda Jasa?" )
            var hint = arrayListOf<String>("Chaim Weizmann", "Nikola Tesla", "Seoul", "Prabowo", "Budiono", "Kolak", "London", "Guru")

            var numRandom = Random.nextInt(0, quetions.size)
            var pickedQuestion = quetions[numRandom]
            var showQuestion = findViewById<TextView>(R.id.question).apply{
                text=pickedQuestion
            }

            myButton.setOnClickListener {
                var answer:String = editText2.text.toString()
                if(answer.compareTo(hint[numRandom]) == 0 ){
                    Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Wrong Answer! The correct answer is " + hint[numRandom], Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
