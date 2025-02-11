package DesignPattern.FactoryMethod;

public class Windows implements OS {
    @Override
    public String spec() {
        return "Windows 10 OS";
    }

    @Override
    public Integer cpu() {
        return 10;
    }
}
