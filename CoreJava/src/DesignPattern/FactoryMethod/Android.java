package DesignPattern.FactoryMethod;

public class Android implements OS {
    @Override
    public String spec() {
        return "Android 14 OS";
    }

    @Override
    public Integer cpu() {
        return 2;
    }
}
