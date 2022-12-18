package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random
/*
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
*/

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollButton.text = "click to roll"
        binding.rollButton.setOnClickListener(){
            rollDice()
        }

    }

    private fun rollDice() {
        // Generate a random number from 0 to 6 and choose dice image accordingly
        val selectDrawableResource = when (Random.nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.rollImage.setImageResource((selectDrawableResource))

    }
}

/*

// scratch

        // initialize a reference to the dice image view
        lateinit var rollImage: ImageView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get a reference to the dice ( ROLL ) button
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Click to roll"
        rollButton.setOnClickListener {
            rollDice()
        }
        rollImage = findViewById(R.id.roll_image)

        rollImage.setImageResource(selectDrawableResource)

        // show a toast as click feedback
        Toast.makeText(this, "Rolled", Toast.LENGTH_SHORT).show()
        // get a reference to the text on the dice roll button
        val rollText: TextView = findViewById(R.id.roll_text)
        rollText.text = randomInt.toString()

 */