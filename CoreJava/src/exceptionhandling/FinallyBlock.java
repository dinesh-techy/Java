package exceptionhandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finally Block exectued...");
        }
    }
}
