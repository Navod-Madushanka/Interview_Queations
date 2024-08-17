package calculator.model;

import calculator.entity.Answer;

public class Calculation {
    private float firstNumber;
    private float secondNumber;
    private String operator;
    public Calculation(final float firstNumber, final String operator, final float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }
    private float calculate() {
        if(operator.equals("+")){
            return firstNumber + secondNumber;
        }else if(operator.equals("-")){
            return firstNumber - secondNumber;
        }else if(operator.equals("*")){
            return firstNumber * secondNumber;
        }else if(operator.equals("/")){
            return firstNumber / secondNumber;
        }else if(operator.equals("%")){
            return firstNumber % secondNumber;
        } else {
            return 0;
        }
    }
    public Answer calculateAnswer() {
        Answer answer = new Answer();
        answer.setAnswer(calculate());
        return answer;
    }
}
