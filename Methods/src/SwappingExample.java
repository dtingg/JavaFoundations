public class SwappingExample {
    static int x = 5;
    static int y = 10;

    public static void main (String[] args){
        System.out.println("Value of x = " + x + " value of y = " + y);
        swap (x, y);
        System.out.println("Value of x = " + x + " value of y = " + y);
    }

    private static void swap(int x2, int y2) {
        x = y2;
        y = x2;
    }
}