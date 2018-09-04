package examples;

public class ThrowExample {
    public static void main(String[] args){
    try {
        System.out.println("Start of our try block");
        throw new MyException("This is my error message.");
    } catch (Exception e){
        System.out.println("Catch block");
        System.out.println(e);
    }
    }
}
