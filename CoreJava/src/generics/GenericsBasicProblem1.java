package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

// Write a generic class to store any type of object

public class GenericsBasicProblem1 {

    static class Box <T>{
        List<T> boxList = new ArrayList<>();
        void storeInBox(T object){
            boxList.add(object);
        }
        List<T> getFromBox(){
            return boxList;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Box.class.getSimpleName() + "[", "]")
                    .add("boxList=" + boxList)
                    .toString();
        }
    }

    public static void main(String[] args) {
        Box<String> colors = new Box<String>();
        colors.storeInBox("Blue");
        colors.storeInBox("Orange");
        colors.storeInBox("White");
        System.out.println(colors);

        Box<Integer> numbers = new Box<>();
        numbers.storeInBox(1);
        numbers.storeInBox(2);
        numbers.storeInBox(3);
        System.out.println(numbers);

    }
}
