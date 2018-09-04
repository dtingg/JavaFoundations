package examples2;

public class Superclass {
    private String str1;

    public Superclass(String str1){
        this.str1 = str1;
    }

    public void test(){
        System.out.println("Made it here");
    }

    public void printMethod(){
        System.out.println("Printed from Superclass");
    }

    private void test2(){
        System.out.println("Can't find me");
    }

    protected void test3(){
        System.out.println("protected method");
    }

    public void test4(){
        test2();
        test3();
    }
}
