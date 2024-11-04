package java8.functionalInterface;

@java.lang.FunctionalInterface
interface Calculation{
    int calculate(int x,int y);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // USING LAMBDA Expression
        Calculation calculation = (x,y)->{
            return x+y;
        };
        System.out.println(calculation.calculate(2,10));
        // USING NON LAMBDA Expression
        Calculation calculation1 = new Calculation() {
            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        };
        System.out.println(calculation1.calculate(20,25));
    }
}
