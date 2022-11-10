package Sep28;

public class shipClient {

    public static void main(String[] args)
    {
        Ship x = new Ship();
        x.setTonnage(2000);
        x.setPassengers(70);

        Ship y = new Ship();
        y.setTonnage(1000);
        y.setPassengers(45);

        System.out.println("Ship x Tonnage: " + x.getTonnage() + " Passengers: " + x.getPassengers());
    }
    
}
