package interviewPrep.ExceptionHandling.part1;

public class ThrowsExample {
    public static void main(String[] args) throws NullPointerException,ArrayIndexOutOfBoundsException,ArithmeticException{
        System.out.println(5/0);
        System.out.println("Wont execute...");
    }
}
