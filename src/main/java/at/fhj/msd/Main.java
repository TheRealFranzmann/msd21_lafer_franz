package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(2,3));
        System.out.println(c.minus(5,10));
        System.out.println(c.divide(3,0));
        System.out.println(c.multiply(7,4));
    }
}
