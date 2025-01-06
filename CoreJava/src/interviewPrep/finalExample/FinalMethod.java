package interviewPrep.finalExample;

class Parent{
    final void parentWill(){
        System.out.println("Final method of parentWill");
    }
}

class Child extends Parent{
//    void parentWill(){
//        System.out.println("Final method of parentWill"); // 'parentWill()' cannot override 'parentWill()' in 'interviewPrep. finalExample. Parent'; overridden method is final
//    }
}

public class FinalMethod {
    public static void main(String[] args) {

    }
}
