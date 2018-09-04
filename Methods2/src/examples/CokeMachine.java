package examples;

public class CokeMachine {
    private String cup;
    public String cup2;

    public CokeMachine() {
    }

    public void dispenseSprite(){
        System.out.println("pour Sprite");
    }

    public void dispenseCoke(){
        System.out.println("pour Coke");
    }

    private void mixCokeDrink(){
        System.out.println("step1");
        System.out.println("step2");
        System.out.println("step3");
    }

    protected void printMixInstructions(){
        mixCokeDrink();
        System.out.println("Instructions printed");
    }
}