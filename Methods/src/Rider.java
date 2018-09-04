public class Rider {
    private String name;
    private Bike bike;

    public Rider(String name, Bike bike) {
        this.name = name;
        this.bike = bike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike1) {
        this.bike = bike1;
    }
}