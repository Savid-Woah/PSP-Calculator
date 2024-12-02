package org.example;

import java.util.HashMap;
import java.util.Map;

public class MathService {

    public static Map<Integer, MathOperation> options = new HashMap<>(Map.of(
            1, MathOperation.SUM,
            2, MathOperation.SUBTRACT,
            3, MathOperation.MULTIPLY,
            4, MathOperation.DIVIDE
    ));

    public static Double operate(Double firstNumber, Double secondNumber, MathOperation mathOperation) {

        return switch (mathOperation) {
            case SUM -> firstNumber + secondNumber;
            case SUBTRACT -> firstNumber - secondNumber;
            case MULTIPLY -> firstNumber * secondNumber;
            case DIVIDE -> firstNumber / secondNumber;
        };
    }
}
