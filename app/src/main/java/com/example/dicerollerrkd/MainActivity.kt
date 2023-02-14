package com.example.dicerollerrkd

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows a user to roll the dice and obtain the result on-screen.
 */
class MainActivity() : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        rollDice() //do a dice-roll when the app starts
    }

    private fun rollDice() {
        val dice1 = Dice(6)
        val result1= dice1.roll()
        val diceImage: ImageView= findViewById(R.id.imageView)
        when(result1)
        {
            1-> diceImage.setImageResource(R.drawable.dice_1)
            2-> diceImage.setImageResource(R.drawable.dice_2)
            3-> diceImage.setImageResource(R.drawable.dice_3)
            4-> diceImage.setImageResource(R.drawable.dice_4)
            5-> diceImage.setImageResource(R.drawable.dice_5)
            6-> diceImage.setImageResource(R.drawable.dice_6)
        }
        diceImage.contentDescription= result1.toString()
        /**
         * making the app more accessible, so that the image value can be read aloud.
         */

        val dice2= Dice(10)
        val result2: TextView= findViewById(R.id.textView2)
        result2.text= dice2.roll().toString()

    }

}

/**
 * This class defines dice object instances.
 */
class Dice(private val faces: Int) {
    fun roll(): Int {
        return (1..faces).random()
    }
}
