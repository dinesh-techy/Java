package oops.abstraction;

public interface Bike {
    static int gear=5;

    Integer increaseSpeed();
    Integer decreaseSpeed();
    Integer applyBreak();
    String currentSpeed();
}
