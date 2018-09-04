
public class FactorTwo {

    public static void main(String[] args) {

        int n = 8;
        int i = 0;

        while (n >= 2) {
            n = n/2;
            i ++;
        }
        System.out.println(i);
    }
}