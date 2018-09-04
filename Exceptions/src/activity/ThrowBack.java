package activity;

public class ThrowBack {
    public static void main(String[] args){
        try {
            checkAge(8);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    private static void checkAge(int age) throws Exception {
        if (age < 10){
            throw new Exception("This is less than 10");

        } else {
            System.out.println(age + " is greater than or equal to 10");
        }
    }
}