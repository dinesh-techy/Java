package java8.lambdaExpression;

import java.util.ArrayList;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Print all the element in arrayList
        arrayList.forEach((x)->{
            System.out.println(x);
        });
    }
}
