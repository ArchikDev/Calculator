package ru.ar4uk.calculator

import androidx.compose.runtime.mutableStateOf
import androidx.core.app.RemoteInput

class CalculatorViewModel  {

    val state = mutableStateOf(
        Display(
            expression = "45x8",
            result = "360"
        )
    )

    fun processCommand(command: CalculatorCommand) {
        when (command) {
            CalculatorCommand.Clear -> {

            }
            CalculatorCommand.Evaluate -> {

            }
            is CalculatorCommand.Input -> {

            }
        }
    }
}

sealed interface CalculatorCommand {

    data object Clear: CalculatorCommand
    data object Evaluate: CalculatorCommand
    data class Input(val symbol: Symbol): CalculatorCommand
}

enum class Symbol {
    DIGIT_0,
    DIGIT_1,
    DIGIT_2,
    DIGIT_3,
    DIGIT_4,
    DIGIT_5,
    DIGIT_6,
    DIGIT_7,
    DIGIT_8,
    DIGIT_9,
    ADD,
    SUBTRACT, // Минус
    MULTIPLY, // Умножить
    DIVIDE,
    PERCENT,
    POWER,
    FACTORIAL,
    SQRT,
    PI,
    DOT,
    PARENTHESIS
}

data class Display(
    val expression: String,
    val result: String
)