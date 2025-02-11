package DesignPattern.FactoryMethod;

public class NothingPhone {
    public static void main(String[] args) {
        OS nothingOS = OSProvider.getMyOS("Android");
        System.out.println(nothingOS.spec());
        System.out.println(nothingOS.cpu());
    }
}
