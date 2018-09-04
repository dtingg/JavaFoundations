
public class SumDouble {

    public static void main(String[] args) {
        int x = 2;
        int y = 2;

        if (x == y){
            System.out.println(2*(x+y));
        } else {
            System.out.println(x+y);
        }
        //shorter way to code it
        int ans = (x==y) ? (x+y)*2 : (x+y);
        System.out.println(ans);
    }
}