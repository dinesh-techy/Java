package DesignPattern.FactoryMethod;

public class OSProvider {
    public static OS getMyOS(String osName){
        if(osName.equals("Windows")){
            return new Windows();
        }
        if (osName.equals("Android")){
            return new Android();
        }
        else{
            return new IOS();
        }
    }
}
