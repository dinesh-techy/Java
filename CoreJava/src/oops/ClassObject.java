package oops;

import java.util.Arrays;
import java.util.StringJoiner;

public class ClassObject {
    // Class Declaration
    public static class Bike{
        // Instance variables or states or attributes
        String bikeName;
        String bikeColor;
        Integer fuelCapacity;
        // Constructor to set values
        public Bike(String bikeName, String bikeColor, Integer fuelCapacity) {
            this.bikeName = bikeName;
            this.bikeColor = bikeColor;
            this.fuelCapacity = fuelCapacity;
        }

        // Reusable method
        @Override
        public String toString() {
            return new StringJoiner(", ", Bike.class.getSimpleName() + "[", "]")
                    .add("bikeName='" + bikeName + "'")
                    .add("bikeColor='" + bikeColor + "'")
                    .add("fuelCapacity=" + fuelCapacity)
                    .toString();
        }
    }
    public static void main(String[] args) {
        System.out.println("We are inside OOPS main class");
        //Object creation - Unique Identity
        Bike yamaha = new Bike("FZ","Blue",13);
        Bike tvs = new Bike("Apache","Black",14);
        System.out.println(yamaha.toString());
        System.out.println(tvs.toString());
    }
}
