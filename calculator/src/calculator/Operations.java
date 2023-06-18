/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;


public class Operations {
// @author Derya Cezik
    public String clear() {
        return "";
    }

    // @author Eda Belge
    public String delete(String text) {
        return text.substring(0, text.length() - 1);
    }
    
// @author Derya Cezik
    public String calculate(String operator, double number1, double number2) throws NumberFormatException {
        double result = 0;

        try {
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        result = number1 / number2;
                        break;
                    } else if (number2 == 0) {
                        throw new NumberFormatException("Undefined");

                    }
            }
            return String.valueOf(result);
        } catch (NumberFormatException ex) {
            return "Undefined";
        } 

    }
}
