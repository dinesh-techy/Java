package exceptionhandling;

import java.util.Arrays;

public class RunTimeException {
    public static void main(String[] args) {
        // Arithmetic Exception
        try{
            System.out.println(50/0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        // Null pointer Exception
        String s=null;
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        // Array Index out of Bound Exception
        int a [] = new int [5];
        try{
            System.out.println(a[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
