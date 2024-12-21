package interviewPrep.ExceptionHandling.part1;

import java.util.Arrays;


class Animal{
    private String animalName;
    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        System.out.println("Exception Handling");
        // Animal 1
        Animal dogs = new Animal("Labradar");
        System.out.println(dogs.getAnimalName());
        // Animal 2
        Animal cat = null;
        // throws Null pointer exception
        System.out.println(cat.getAnimalName());

        try{
            System.out.println(5/0);
            System.out.println("Wont Execute"); // This line will not be executed
        }
        catch (NullPointerException | ArithmeticException e ){
            throw new NullPointerException("Null Pointer");
        }
        finally {
            System.out.println("Finally block will be executed...");
        }
        System.out.println("Rest of the code....");
    }
}
