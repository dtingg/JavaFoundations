package examples;

public class ThrowsProdExample {
    public static void main(String[] args){
    try{
        productCheck(60);
    } catch (InvalidProductException e){
        System.out.println("Caught the exception");
        System.out.println(e.getMessage());
        System.out.println(e);
    }
    }

    private static void productCheck(int weight) throws InvalidProductException{
        if (weight < 100){
            throw new InvalidProductException("Product is invalid.");
        } else {
            System.out.println("Product is okay.");
        }
    }
}