package at.fhj.msd;

import org.w3c.dom.ls.LSOutput;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author franz lafer
 * Here is my calculator class were I created all the methods a calculator needs.
 */

public class Calculator {

    Logging logging = new Logging();
    private static Logger logger = LogManager.getLogger();

    /**
     * Adds two numbers together to get a certain result.
     * @param number1 The first number the user enters in a calculator.
     * @param number2 The second number the user enters in a calculator.
     * @return the result between two numbers
     */
    public double add(double number1, double number2) {

        return number1 + number2;
    }

    /**
     * Subtracts two numbers and returns the result.
     * @param number1 The first number the user enters in a calculator.
     * @param number2 The second number the user enters in a calculator.
     * @return The result of two numbers.
     */
    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Multiplies two numbers and returns the result.
     * @param number1 The first number the user enters in a calculator.
     * @param number2 The second number the user enters in a calculator.
     * @return The result of two numbers.
     */
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Divides two numbers and returns the result.
     * @param number1 The first number the user enters in a calculator.
     * @param number2 The second number the user enters in a calculator.
     * @return The result of two numbers.
     * @throws ArithmeticException Will print out "Division by zero" if a 0 was entered the second number.
     */
    public double divide(double number1, double number2) throws ArithmeticException{
        logger.debug(number1/number2);
        if(number2 == 0){
            logger.error("Division by zero");
            throw new ArithmeticException();
        }else{
            return number1/number2;
        }
    }

    /**
     * Gets a number and starts with this number, in every turn, the method subtracts the number one from the first number
     * and multiplies it with the first number. The method works recursively.
     * For example, you take 4: the method start with 4, multiplies with 3 and for the last part, multiplies with 2.
     * It doesn't multiply with 1 because everything multiplied with one is the same number again.
     *
     * @param num The number with which the method starts.
     * @return The result of the faculty.
     */
    public int fak(int num) {
        int i = 1;
        if (num > i) {
            num *= fak(num - 1);
        }else if (num <= 0){
            return 0;
        }
        return num;
    }
}