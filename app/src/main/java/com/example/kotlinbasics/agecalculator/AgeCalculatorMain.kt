package com.example.kotlinbasics.agecalculator

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.kotlinbasics.R
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class AgeCalculatorMain : AppCompatActivity() {

    private var selectedDateTextView: TextView? = null
    private var calculatedAgeTextView: TextView? = null
    private var todaysDateTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.age_calculator_layout)

        val datePickerButton: Button = findViewById(R.id.select_date_button)
        selectedDateTextView = findViewById(R.id.selected_date_value_text)
        calculatedAgeTextView = findViewById(R.id.calculated_age_text)

        datePickerButton.setOnClickListener {
            handleDatePicker()
        }
    }

    private fun handleDatePicker() {
        val myCalendar = Calendar.getInstance()
        val currentYear = myCalendar.get(Calendar.YEAR)
        val currentMonth = myCalendar.get(Calendar.MONTH)
        val currentDay = myCalendar.get(Calendar.DAY_OF_MONTH)

        val currentFullDate = "$currentYear/${currentMonth + 1}/$currentDay"
        val formattedCurrentFullDate =
            SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(currentFullDate)

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDay ->
                val selectedFullDate = "$selectedYear/${selectedMonth + 1}/$selectedDay"

                selectedDateTextView?.text = selectedFullDate

                val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

                val formattedSelectedDate = simpleDateFormat.parse(selectedFullDate)

                Toast.makeText(
                    this,
                    "You are currently 20 years old.",
                    Toast.LENGTH_SHORT
                ).show()
            },
            currentYear, currentMonth, currentDay
        ).show()
    }
}
