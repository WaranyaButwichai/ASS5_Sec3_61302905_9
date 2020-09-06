package com.example.ass5_sec3_61302905_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SentData(view: View){
        var Gender = ""
        try {
            var selectID :Int = radioGroup.checkedRadioButtonId
            var radioButtonChecked : RadioButton = findViewById(selectID)
            Gender = radioButtonChecked.text as String
        }catch (a : Exception){
            Gender = ""
        }
        val intent = Intent( this, SecondActivity::class.java)
        intent.putExtra("EmpData", Employee(edit_name.text.toString(),Gender.toString(),edit_email.text.toString(),edit_salary.text.toString()))
        startActivity(intent)

    }
    fun resetInfortion(view: View) {
        edit_name.text.clear()
        radioGroup.clearCheck()
        edit_email.text.clear()
        edit_salary.text.clear()
    }
}