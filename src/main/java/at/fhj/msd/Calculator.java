package at.fhj.msd;

import org.w3c.dom.ls.LSOutput;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {

    Logging logging = new Logging();
    private static Logger logger = LogManager.getLogger();
    public double add(double number1, double number2) {

        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) throws ArithmeticException{
        logger.debug(number1/number2);
        if(number2 == 0){
            logger.error("Division by zero");
            throw new ArithmeticException();
        }else{
            return number1/number2;
        }
    }

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