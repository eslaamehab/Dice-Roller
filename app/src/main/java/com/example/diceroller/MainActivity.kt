package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        // get something
        val rollImage: ImageView = findViewById(R.id.roll_image)
        // Generate a random number from 0 to 6
        val randomInt = Random.nextInt(6) + 1
        val selectDrawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        rollImage.setImageResource(selectDrawableResource)





//        // scratch
//
//        // show a toast as click feedback
//        Toast.makeText(this, "Rolled", Toast.LENGTH_SHORT).show()
//        // get SOMETHING
//        val rollText: TextView = findViewById(R.id.roll_text)
//        rollText.text = randomInt.toString()
    }
}