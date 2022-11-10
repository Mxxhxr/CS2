package Oct5;

public class Cat {
    // attributes
    private int feet;
    private double weight;

    // symbolic constants
    private final int MIN_FEET = 1;
    private final double MIN_WEIGHT = 0.5;
    
    // mutator
    public void setFeet(int f){
        if (f >= MIN_FEET){
            feet = f;
        }
        else{
            feet = MIN_FEET;
        }
    }
    // accessor
    public int getFeet(){
        return feet;
    }
    // mutator
    public void setWeight(double w){
        if (w >= MIN_WEIGHT){
            weight = w;
        }
        else{
            weight = MIN_WEIGHT;
        }

    }
    // accessor
    public double getWeight(){
        return weight;

    }
    // default constructor
    public Cat(){
        feet = MIN_FEET;
        weight = MIN_WEIGHT;
    }
    // an overloaded constructor
    public Cat(double w, int f){
        setWeight(w);
        setFeet(f);

    }
}

