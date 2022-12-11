package Lab3;
import java.lang.Exception;

public class Car {
    // attributes
    private int year;
    private double price;
    private String make;
    private String vin;
    private static int Count = 0;
    
    // symbolic constants
    private final int MIN_YEAR = 1970;
    private final int MAX_YEAR = 2011;
    private final double MIN_PRICE = 0;
    private final double MAX_PRICE = 100000;
    
    // default constructor
    public Car() {
        year = MIN_YEAR;
        price = MIN_PRICE;
        make = "N/A";
        vin = "N/A";
        Count++;
    }
    // overloaded constructor
    public Car(int y, double p, String m, String v) throws CarException {
        setYear(y);
        setPrice(p);
        setMake(m);
        setVin(v);
        Count++;
    }
    //copy constructor
    public Car(Car c){
        year = c.getYear();
        price = c.getPrice();
        make = c.getMake();
        vin = c.getVin();
        Count++;
    }
    
    // setter for year
    public void setYear(int y) throws CarException {
        if (y >= MIN_YEAR && y <= MAX_YEAR) {
            year = y;
        }
        else {
            throw new CarException("Invalid Year");
        }
    }
    // setter for price
    public void setPrice(double p) throws CarException {
        if (p >= MIN_PRICE && p <= MAX_PRICE) {
            price = p;
        }
        else {
            throw new CarException("Invalid Price");
        }
        
    }

    public void setMake(String m) throws CarException {
        if(m == null || m.trim().equals("")){
            throw new CarException("Invalid Make");
        }
        make = m;
    }

    public void setVin(String v) throws CarException {
        if(v == null || v.trim().equals("")){
            throw new CarException("Invalid Vin");
        }
        vin = v;
    }

    // getter for year
    public int getYear() {
        return year;
        
    }
    // getter for price
    public double getPrice() {
        return price;
    }

    public String getMake(){
        return make;
    }

    public String getVin(){
        return vin;
    }

    public int getCount(){
        return Count;
    }

    public String toString(){
        return "[Year:"+year+",Price:"+(int)price+",Make:"+make+",Vin:"+vin+"]";
    }
    
    public void finalize(){
        System.out.println("The finalize method called.");
        Count--;
    }
    
}
