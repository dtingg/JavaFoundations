package activity;

public class QuadraticRoots {
    public static void main(String[] args){
        quadratic(2, 4, -4);
    }

    public static void quadratic (double a, double b, double c){
        double num = Math.sqrt(Math.pow(b, 2) - 4*a*c);

        //Format answer to two decimal places
        double one = (-b + num)/(2*a);
        System.out.println(String.format("%.2f", one));

        double two = (-b - num)/(2*a);
        System.out.println(String.format("%.2f", two));
    }
}