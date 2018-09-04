package activity;

public class TryCatch {

    public static void main(String[] args){

        try{
            char[] c = new char[10];
            c[10] = 'T';

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry, that index number is out of bounds.");
        }
    }
}