public class BikeClub {

    public static void main(String[] args){
    //bike 1
    int gears1 = 6;
    int speed1 = 25;

    //bike 2
    int gears2 = 1;
    int speed2 = 15;

    String name1 = "Phil";
    String name2 = "Frank";

    Bike bike1 = new Bike(gears1, speed1);
    Bike bike2 = new Bike(gears2, speed2);

    Rider rider1 = new Rider(name1, bike1);
    Rider rider2 = new Rider(name2, bike2);

    //print rider name, gears, and top speed
    System.out.println(rider1.getName() + " has a " + rider1.getBike().getGears() + " gear bike with a top speed of " + rider1.getBike().getSpeed() + ".");
    System.out.println(rider2.getName() + " has a " + rider2.getBike().getGears() + " gear bike with a top speed of " + rider2.getBike().getSpeed() + ".");

    //change rider1 and rider2 top speed and print out
    bike1.setSpeed(50);
    bike2.setSpeed(100);
    System.out.println(rider1.getName() + " changed his top speed to " + rider1.getBike().getSpeed() + ".");
    System.out.println(rider2.getName() + " changed his top speed to " + rider2.getBike().getSpeed() + ".");
    }
}