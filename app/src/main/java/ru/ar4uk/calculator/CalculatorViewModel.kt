package ru.ar4uk.calculator

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CalculatorViewModel: ViewModel()  {

    private val _state = MutableStateFlow(
        Display(
            expression = "45x8",
            result = "360"
        )
    )
    val state = _state.asStateFlow()

    fun processCommand(command: CalculatorCommand) {
        when (command) {
            CalculatorCommand.Clear -> {
                _state.value = Display(
                    expression = "",
                    result = ""
                )
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