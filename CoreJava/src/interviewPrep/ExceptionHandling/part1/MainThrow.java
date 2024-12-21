package interviewPrep.ExceptionHandling.part1;

public  class MainThrow  {
    public void square(){
        throw new NullPointerException("Null pointer exception");
    }
    public void rectangle(){
        throw new ArithmeticException("Arithmetic exception");
    }
    public static void main(String[] args) {
        MainThrow obj = new MainThrow();
        obj.square();
        obj.rectangle();
        System.out.println("Rest of the code....");
    }
}

