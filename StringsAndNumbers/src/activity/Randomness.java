package activity;

public class Randomness {
    public static void main(String[] args){
        //Generate a random number between 45 and 50
        int max = 50;
        int min = 45;
        double z = Math.random();
        z = (int) (z*(max-min) + min);
        System.out.println(z);
    }
}