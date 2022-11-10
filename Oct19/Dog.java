package Oct19;

public class Dog {
    protected double height;
    protected double weight;
    
    public Dog(double h, double w){
        height = h;
        weight = w;
    }

    private void finalize(){
        System.out.println("Finalized called.");
    }
}
