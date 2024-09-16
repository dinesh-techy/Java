package oops.abstraction;

import java.util.StringJoiner;

public class TvsImpl implements Bike{

    Integer currentSpeed;

    public TvsImpl(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public Integer increaseSpeed() {
        currentSpeed+=10;
        return currentSpeed;
    }

    @Override
    public Integer decreaseSpeed() {
        currentSpeed-=10;
        return currentSpeed;
    }

    @Override
    public Integer applyBreak() {
        currentSpeed=0;
        return 0;
    }

    @Override
    public String currentSpeed() {
        return new StringJoiner(", ", TvsImpl.class.getSimpleName() + "[", "]")
                .add("currentSpeed=" + currentSpeed)
                .toString();
    }

    public static void main(String[] args) {
        // Bike is an Interface and object is created with the Impl of Interface
        Bike apache = new TvsImpl(90);
        System.out.println(gear);
        System.out.println(apache.currentSpeed());
        apache.increaseSpeed();
        System.out.println(apache.currentSpeed());
    }
}

