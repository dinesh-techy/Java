package DesignPattern.FactoryMethod;

public class IOS implements OS {
    @Override
    public String spec() {
        return "IOS a closed System";
    }

    @Override
    public Integer cpu() {
        return 5;
    }
}
