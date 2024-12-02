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

        validateOperationInputNumbers(firstNumber, secondNumber);

        return switch (mathOperation) {
            case SUM -> firstNumber + secondNumber;
            case SUBTRACT -> firstNumber - secondNumber;
            case MULTIPLY -> firstNumber * secondNumber;
            case DIVIDE -> firstNumber / secondNumber;
        };
    }

    public static void validateOperationInputNumbers(Double firstNumber, Double secondNumber) {

        if(firstNumber < 1 || secondNumber < 1) {
            throw new RuntimeException("""
                    Los números deben ser iguales o mayores a 1.
                    Reinicie el programa e intente de nuevo""");
        }
    }
}
