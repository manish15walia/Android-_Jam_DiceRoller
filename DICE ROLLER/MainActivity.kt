package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton:Button = findViewById(R.id.rollButton)
        val textView:TextView=findViewById(R.id.textView)
        val imageView: ImageView =findViewById(R.id.imageView)

        rollButton.setOnClickListener{
            var c : Int=(1..6).random()

            when(c){
                1->imageView.setImageResource(R.drawable.dice_1)
                2->imageView.setImageResource(R.drawable.dice_2)
                3->imageView.setImageResource(R.drawable.dice_3)
                4->imageView.setImageResource(R.drawable.dice_4)
                5->imageView.setImageResource(R.drawable.dice_5)
                6->imageView.setImageResource(R.drawable.dice_6)
                else->imageView.setImageResource(R.drawable.dice_6)
            }

            textView.text=c.toString()


        }
    }
}