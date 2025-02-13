package DesignPattern.BuilderPattern;

public class NothingPhone {
    public static void main(String[] args) {
        Phone nothingPhone = new PhoneBuilder().setPhoneName("Nothing Phone1").setOperatingSystem("Android").setRam(8).setVersion(14).setStorage(512).createPhone();
        Phone iPhone = new PhoneBuilder().setPhoneName("NothingPhone 2A").setOperatingSystem("Android").setRam(6).setStorage(128).setVersion(12).setPrice(12000).createPhone();

        System.out.println(nothingPhone);
        System.out.println(iPhone);
    }
}
