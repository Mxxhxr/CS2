package Sep28;

public class Ship {

    private double tonnage;
    private int passengers;

    private final double MIN_TONNAGE = 10;
    private final int MIN_PASSENGER = 20;
    
    
    public void setTonnage(double t)
    {
        if (t>=MIN_TONNAGE)
        {
            tonnage = t;
        }
        else
        {
            tonnage = MIN_TONNAGE; // only good thing to do here is throw an exception
        }
    }


    public double getTonnage()
    {
        return tonnage;
    }

    
    public void setPassengers(int p)
    {
        if (p>=MIN_PASSENGER)
        {
            passengers = p;
        }
        else
        {
            passengers = MIN_PASSENGER; // again, only good thing is to throw an exception
        }
    }


    public int getPassengers()
    {
        return passengers;
    }

    public Ship() // defualt constructor
    {
        tonnage = MIN_TONNAGE;
        passengers = MIN_PASSENGER;
        
    }

    public Ship(double t, int p)
    {
        tonnage = t;
        passengers = p;

        setTonnage(t);
        setPassengers(p);
    }
}
