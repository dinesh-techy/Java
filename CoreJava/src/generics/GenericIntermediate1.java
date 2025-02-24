package generics;

import java.util.Arrays;

// Swap Elements using a generic Method

public class GenericIntermediate1 {

    public static <T> T[] swapElements(int position1, int position2, T[] items){
        Object temporary = items[position1];
        items[position1]=items[position2];
        items[position2]= (T) temporary;
        return items;
    }
    public static void main(String[] args) {
        String [] names = {"Akila","Dinesh","Dhanush","Akshay Shadipuram"};
        String[] swappedNames = swapElements(3,2,names);
        Arrays.stream(swappedNames).forEach(System.out::println);
    }
}
