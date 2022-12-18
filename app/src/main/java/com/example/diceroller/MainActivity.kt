package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get SOMETHING
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Click to roll"
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        // show a toast as click feedback
        Toast.makeText(this, "Rolled", Toast.LENGTH_SHORT).show()
        // get SOMETHING
        val rollText: TextView = findViewById(R.id.roll_text)
        // Generate a random number from 0 to 6
        val randomInt = Random.nextInt(6) + 1
        rollText.text = randomInt.toString()
    }
}