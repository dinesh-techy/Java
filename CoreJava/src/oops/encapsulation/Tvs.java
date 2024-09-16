package oops.encapsulation;

public class Tvs {
    public static void main(String[] args) {
        BikeClass apache = new BikeClass();

        // Setting the data
        apache.setBikeName("RTR 160-4V");
        apache.setBikePrice(145000);
        apache.setMfgDate(2023);

        // Accessing the DATA - GET
        System.out.println(apache.getBikeName());
        System.out.println(apache.toString());
    }
}
