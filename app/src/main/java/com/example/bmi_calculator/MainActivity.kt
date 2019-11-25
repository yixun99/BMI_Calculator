package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
            val weight :Double =editTextWeight.text.toString().toDouble()
            val height :Double =editTextHeight.text.toString().toDouble()
            val bmi:Double = weight/(height*height)


            val result:String
            if(bmi < 18.5 ){
                result = "UNDER"
                imageViewProfile.setImageResource(R.drawable.under)


            }else if(bmi < 24.9){
                result = "NORMAL"
                imageViewProfile.setImageResource(R.drawable.normal)

            }else{
                result = "OVER"
                imageViewProfile.setImageResource(R.drawable.over)
            }
            textViewBMI.text = "BMI : %.2f (%s)".format(bmi, result)


        }

        buttonReset.setOnClickListener(){
            editTextHeight.setText("")
            editTextWeight.setText("")
            textViewBMI.setText("")

            imageViewProfile.setImageResource(R.drawable.empty)

            editTextWeight.requestFocus()

        }


    }
}
