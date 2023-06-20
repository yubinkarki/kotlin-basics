package com.example.kotlinbasics.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinbasics.R

class BasicCalculator : AppCompatActivity() {
    private var lastNumeric: Boolean = false
    private var lastDot: Boolean = false

    private var numbersContainer: TextView? = null

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        setContentView(R.layout.basic_calculator)

        numbersContainer = findViewById(R.id.numbersContainer)
    }

    fun onDigit(view: View) {
        numbersContainer?.append((view as Button).text)
        lastNumeric = true
        lastDot = false
    }

    fun onClear(view: View) {
        numbersContainer?.text = ""
    }

    fun onDecimalPoint(view: View) {
        if (lastNumeric && !lastDot) {
            numbersContainer?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    fun onOperator(view: View) {
        numbersContainer?.text?.let {
            if (lastNumeric && !isOperatorAdded(it.toString())) {
                numbersContainer?.append((view as Button).text)
                lastNumeric = false
                lastDot = false
            }
        }
    }

    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/")
                    || value.contains("*")
                    || value.contains("+")
                    || value.contains("-")
        }
    }

    fun onEqual(view: View) {
        if (lastNumeric) {
            var inputValue = numbersContainer?.text.toString()
            var prefix = ""

            try {
                if (inputValue.startsWith("-")) {
                    prefix = "-"
                    inputValue = inputValue.substring(1)
                }

                if (inputValue.contains("-")) {
                    val splitInputValue = inputValue.split("-")

                    var leftNum = splitInputValue[0] // Var because prefix is added in some cases.
                    val rightNum = splitInputValue[1]

                    if (prefix.isNotEmpty()) {
                        leftNum = prefix + leftNum
                    }

                    numbersContainer?.text = removeZero((leftNum.toDouble() - rightNum.toDouble()).toString())
                } else if (inputValue.contains("+")) {
                    val splitInputValue = inputValue.split("+")

                    var leftNum = splitInputValue[0] // Var because prefix is added in some cases.
                    val rightNum = splitInputValue[1]

                    if (prefix.isNotEmpty()) {
                        leftNum = prefix + leftNum
                    }

                    numbersContainer?.text = removeZero((leftNum.toDouble() + rightNum.toDouble()).toString())
                } else if (inputValue.contains("*")) {
                    val splitInputValue = inputValue.split("*")

                    var leftNum = splitInputValue[0] // Var because prefix is added in some cases.
                    val rightNum = splitInputValue[1]

                    if (prefix.isNotEmpty()) {
                        leftNum = prefix + leftNum
                    }

                    numbersContainer?.text = removeZero((leftNum.toDouble() * rightNum.toDouble()).toString())
                } else if (inputValue.contains("/")) {
                    val splitInputValue = inputValue.split("/")

                    var leftNum = splitInputValue[0] // Var because prefix is added in some cases.
                    val rightNum = splitInputValue[1]

                    if (prefix.isNotEmpty()) {
                        leftNum = prefix + leftNum
                    }

                    numbersContainer?.text = removeZero((leftNum.toDouble() / rightNum.toDouble()).toString())
                }
            } catch (e: ArithmeticException) {
                e.printStackTrace()
            }
        }
    }

    private fun removeZero(value: String): String {
        var result = value

        if (value.contains(".0"))
            result = value.substring(0, value.length - 2)

        return result
    }
}