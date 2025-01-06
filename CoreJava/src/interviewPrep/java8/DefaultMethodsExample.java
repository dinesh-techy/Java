package interviewPrep.java8;

interface Car{
    String carName();
    default String modeOfTransport(){
        return "Road mode transport";
    };
    Integer wheels();
}

public class DefaultMethodsExample implements Car {
    @Override
    public String carName() {
        return "";
    }

    @Override
    public Integer wheels() {
        return 0;
    }
}

