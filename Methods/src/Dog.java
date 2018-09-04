public class Dog {

    private String breed;
    private int age;

    public Dog(String breed1, int age1) {
        this.breed = breed1;
        this.age = age1;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}