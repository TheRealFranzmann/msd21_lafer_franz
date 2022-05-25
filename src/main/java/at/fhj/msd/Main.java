package at.fhj.msd;


/**
 * @author Franz Lafer
 * The startpoint of my program, my main class <3.
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Here I initiate my calculator object to interact with it in my main with all the methods.
         */
        Calculator c = new Calculator();

        /**
         * Here I print all my methods in my console.
         */
        System.out.println(c.add(2,3));
        System.out.println(c.minus(5,10));
        System.out.println(c.divide(3,0));
        System.out.println(c.multiply(7,4));

        /**
         * The Logging Object from UB05
         */
        Logging logging = new Logging();

        logging.errorMessage();
        logging.infoMessage();
    }
}
