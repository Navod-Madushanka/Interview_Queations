package calculator;

import calculator.entity.Answer;
import calculator.entity.FirstNumber;
import calculator.entity.Operator;
import calculator.entity.SecondNumber;
import calculator.model.Calculation;

import java.util.Scanner;

public class Calculator {

    public static FirstNumber firstNumber;
    public static Operator operator;
    public static SecondNumber secondNumber;

    public Calculator() {

    }
    public static  void getUserData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber.setFirstNumber(scanner.nextInt());

        // Consume the leftover newline character
        scanner.nextLine();

        System.out.println("Enter operator: ");
        operator.setOperator(scanner.nextLine());

        System.out.println("Enter second number: ");
        secondNumber.setNumber(scanner.nextInt());
    }
    public static void main(String[] args) {
        firstNumber = new FirstNumber();
        operator = new Operator();
        secondNumber = new SecondNumber();
        getUserData();

        Calculation calculation = new Calculation(firstNumber.getFirstNumber(), operator.getOperator(), secondNumber.getNumber());
        Answer answer = calculation.calculateAnswer();
        System.out.println(answer.getAnswer());
    }
}
