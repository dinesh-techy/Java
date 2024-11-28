package java8.defaultMethod;

import java.util.Arrays;

interface Car{
    abstract String carName(String brand);
    abstract Integer fuelPrice(int liters);
    default String driveMode(){
        return "Manual mode";
    }

    // Static method
    static void staticMethod(){
        System.out.println("Static method executed....");
    }
}
class Tata implements Car{
    @Override
    public String carName(String brand) {
        return "Car brand is "+brand;
    }
    @Override
    public Integer fuelPrice(int liters) {
        return 102*liters;
    }
}

class Suzuki implements Car{

    @Override
    public String carName(String brand) {
        return "Brand is "+brand;
    }

    @Override
    public Integer fuelPrice(int liters) {
        return liters*102;
    }
    // We still can override the driveMode
    @Override
    public String driveMode() {
        return "Automatic Mode";
    }
}

public class DefaultMethodImpl{
    public static void main(String[] args) {
        Car tataAltroz = new Tata();
        System.out.println(tataAltroz.carName("Altroz XZ"));
        System.out.println("Fuel price is "+tataAltroz.fuelPrice(25));
        System.out.println("Drive mode " + tataAltroz.driveMode());

        Car swift = new Suzuki();
        System.out.println(swift.carName("Suzuki Swift 2024"));
        System.out.println(swift.fuelPrice(30));
        System.out.println(swift.driveMode());
        Car.staticMethod();
    }
}
