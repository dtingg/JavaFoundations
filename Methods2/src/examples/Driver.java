package examples;

import examples2.Superclass;

public class Driver {
    public static void main(String[] args){
        CokeMachine drink = new CokeMachine();

        drink.cup2 = "hi";

        drink.dispenseCoke();

        drink.printMixInstructions();

        Superclass sup = new Superclass("Hi");
        sup.test();
        //sup.test2(); //this is private so I can't access it.
        //sup.test3(); //this is protected. Can't access from another package.
        sup.test4();
    }
}