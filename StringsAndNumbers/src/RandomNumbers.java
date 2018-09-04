public class RandomNumbers {
    public static void main(String[] args){
    double x = Math.random();
        System.out.println(x);

        // random number between 1 and 10
        x = (int) (x*10 + 1);
        System.out.println(x);
    }
}