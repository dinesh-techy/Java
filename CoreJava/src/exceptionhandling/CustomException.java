package exceptionhandling;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String errorMsh){
        super(errorMsh);
    }
}

public class CustomException {
    static void validate(int age) throws InvalidAgeException{
        if(age>30){
                System.out.println("Crossed adulthood...");
        }
        else{
            throw new InvalidAgeException("Error in age");
        }
    }
    public static void main(String[] args) throws Exception {
        validate(20);
    }
}
