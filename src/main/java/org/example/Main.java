package org.example;

import java.util.Scanner;

import static org.example.MathService.operate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ---------------------- ");
        System.out.println(" ---------------------- ");

        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");

        System.out.print("Ingrese el número de la operación que desea ejecutar: ");
        Integer optionSelected = scanner.nextInt();

        MathOperation mathOperation = MathService.options.get(optionSelected);
        if(mathOperation == null) throw new RuntimeException("Operación no válida");

        System.out.print("Ingrese el primer número: ");
        Double firstNumber = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        Double secondNumber = scanner.nextDouble();

        System.out.println(" ---------------------- ");
        System.out.println(" ---------------------- ");

        Double result = operate(firstNumber, secondNumber, mathOperation);

        System.out.print("El resultado es: " + result);
    }
}