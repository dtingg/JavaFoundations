package activity;

public class OverWeightLimit extends Exception {
    String str;

    public OverWeightLimit(String str) {
        this.str = str;
    }

    public String toString() {
        return (str);
    }
}