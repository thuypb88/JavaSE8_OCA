package JavaExceptionExamples;

public class Retread extends Tire {
    public static void main(String[] args) {
        new Retread().doStuff();
    }

    void doStuff() throws ArithmeticException{
        System.out.println(7 / 0);
    }
}
