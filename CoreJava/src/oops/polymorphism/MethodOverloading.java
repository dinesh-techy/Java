package oops.polymorphism;

public class MethodOverloading {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(int a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.sum(10,20));
        System.out.println(methodOverloading.sum(10,20,10));
    }
}
