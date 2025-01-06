package interviewPrep.java8;

@FunctionalInterface
interface Mathematics{
    abstract Integer add(Integer a,Integer b);
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        Mathematics mathematics = (a,b)->{return a+b;};
        System.out.println(mathematics.add(10,20));
    }
}
