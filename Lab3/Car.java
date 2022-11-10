package Lab3;

public class Car {
    // attributes
    private int year;
    private double price;

    // symbolic constants
    private final int MIN_YEAR = 1970;
    private final int MAX_YEAR = 2011;
    private final double MIN_PRICE = 0;
    private final double MAX_PRICE = 100000;


    // setter for year
    public void setYear(int y) {
        if (y >= MIN_YEAR && y <= MAX_YEAR) {
            year = y;
        }
        else {
            year = MIN_YEAR;
        }
    }
    // getter for year
    public int getYear() {
        return year;

    }
    // setter for price
    public void setPrice(double p) {
        if (p >= MIN_PRICE && p <= MAX_PRICE) {
            price = p;
        }
        else {
            price = MIN_PRICE;
        }

    }
    // getter for price
    public double getPrice() {
        return price;
    }
}
