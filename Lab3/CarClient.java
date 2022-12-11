package Lab3;
import java.lang.Exception;
//import Oct5.Cat;

public class CarClient {
    
    public static void main(String[] args) throws Exception {
        // Car x = new Car();
        // System.out.println("Year: " + x.getYear());
        // System.out.println("Price " + x.getPrice());
        
        // Car z = new Car(2004, 25000);
        // System.out.println(z);
        
        // Car y = new Car();
        // y.setYear(2008);
        // y.setPrice(15000);
        // System.out.println("Year: " + y.getYear());
        // System.out.println("Price: " + y.getPrice());
        
        // Car yCopy = new Car(y);
        // System.out.println("\nYear: " + yCopy.getYear());
        // System.out.println("Price: " + yCopy.getPrice());
        
        // Car c = new Car(2003,150000);
        
        // Car x = new Car(2001,15000);
        // System.out.println("Car x is created. Its stats: "+x+".");
        
        // Car c = new Car(2001,15000,"    ",null);
        // Car c = new Car(2001,15000,"Ford",null);
        // Car c = new Car(2001,15000,"Ford","JHG23GV");
        // System.out.println(c);
        
        // c.setMake(null);
        // c.setVin("   ");
        
        // Car x = new Car(2001,15000,"Ford","JHG23GV");
        // System.out.println(x.getCount());
        // Car y = new Car(2010,35000,"Jeep","27234BHS");
        // System.out.println(y.getCount());
        // createCars();
        
        // System.out.println(y.getCount());

    }

    public static void createCars() throws CarException{
        Car x = new Car(2001,15000,"Ford","JHG23GV");
        System.out.println(x.getCount());
        Car y = new Car(2010,35000,"Jeep","27234BHS");
        System.out.println(y.getCount());
        Car z = new Car(2010,35000,"Lambo","2876342HGH");
        System.out.println(z.getCount());
    }
}
