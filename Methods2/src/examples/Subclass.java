package examples;

import examples2.Superclass;

public class Subclass extends Superclass {
    public Subclass(String str2) {
        super(str2);
    }

    public void printMethod(){
        super.printMethod();
        System.out.println("Printed from Subclass");
    }

    public static void main(String[] args){
        String str2 = "me";
        Subclass s = new Subclass(str2);
        System.out.println("");
        s.test();
        //s.test2(); //this is a private method that can't be reached
        s.test3(); // I can access  this method because this class extends Superclass
        s.printMethod();
    }
}