package com.example.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button4.setOnClickListener {
            var num1 = editTextTextMultiLine.text
            var num2 = editTextTextMultiLine2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "") {
                Toast.makeText(applicationContext, "Please Input Num1 and Num2", Toast.LENGTH_SHORT)
                    .show()
            } else {
                textView7.setText("+")
                num3 = (num1.toString().toInt() + num2.toString().toInt())
                textView9.setText(num3.toDouble().toString())
                textView8.setText("=")
            }


        }
        button2.setOnClickListener {
            var num1 = editTextTextMultiLine.text
            var num2 = editTextTextMultiLine2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "") {
                Toast.makeText(applicationContext, "Please Input Num1 and Num2", Toast.LENGTH_SHORT)
                    .show()
            } else {
                textView7.setText("-")
                num3 = (num1.toString().toInt() - num2.toString().toInt())
                textView9.setText(num3.toDouble().toString())
                textView8.setText("=")
            }
        }
        button3.setOnClickListener {
            var num1 = editTextTextMultiLine.text
            var num2 = editTextTextMultiLine2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "") {
                Toast.makeText(applicationContext, "Please Input Num1 and Num2", Toast.LENGTH_SHORT)
                    .show()
            } else {
                textView7.setText("x")
                num3 = (num1.toString().toInt() * num2.toString().toInt())
                textView9.setText(num3.toDouble().toString())
                textView8.setText("=")
            }
        }
        button.setOnClickListener {
            var num1 = editTextTextMultiLine.text
            var num2 = editTextTextMultiLine2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "") {
                Toast.makeText(applicationContext, "Please Input Num1 and Num2", Toast.LENGTH_SHORT)
                    .show()
            } else {
                textView7.setText("÷")
                num3 = (num1.toString().toInt() / num2.toString().toInt())
                textView9.setText(num3.toDouble().toString())
                textView8.setText("=")
            }
        }
        button5.setOnClickListener {
            var num1 = editTextTextMultiLine.text
            var num2 = editTextTextMultiLine2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "" || num2.toString() == "0") {
                Toast.makeText(
                    applicationContext,
                    "Do Not Num2 is Zero or Null!!!",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                textView7.setText("mod")
                num3 = (num1.toString().toInt() % num2.toString().toInt())
                textView9.setText(num3.toDouble().toString())
                textView8.setText("=")
            }
        }
        button6.setOnClickListener {
            editTextTextMultiLine.setText("")
            editTextTextMultiLine2.setText("")
            textView7.setText("")
            textView9.setText("")
            textView8.setText("")
        }


    }
    }
