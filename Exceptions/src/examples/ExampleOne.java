package examples;

public class ExampleOne {
    public static void main(String[] args) {
        //Arithmetic exception
        int num1 = 30;
        int num2 = 0;
        int output = 0;

        try {
            output = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by 0");
        } finally { //runs regardless
            System.out.println("Nothing to see here.");
        }

        //Array out of bounds exception
        try {
            int[] a = new int[10];
            //Array can only have 10 elements
            a[11] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }

        //Null pointer exception
        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        } catch (Exception e){
            System.out.println("Catch all");
        }
    }
}