public class Examples {

    public static void main (String[] args){
        System.out.println("Hi");

        int a = 5;
        int b = 4;

        int sum = addition(a, b);
        message(sum);

        String breed = "Husky";
        int age = 5;
        Dog pet = new Dog(breed, age);
        System.out.println(pet.getBreed());
        pet.setBreed("Ant");
        System.out.println(pet.getBreed());
    }

    private static void message(int sum){
        System.out.println(sum);
    }

    private static int addition (int a, int b){
        int sum = a + b;
        return sum;
    }
}