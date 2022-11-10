package Oct12;

public class Mouse {
    private int age;
    private double weight;


    public Mouse(int a, double w){ //WARNING! This is not a complete constructor
        age = a;
        weight = w;
    }

    //no good! gives "mickey" regardless of age/weight of mouse
    //completely defies the purpose of attributes.
    /*
    public String toString(){
        return "Mickey";
    }
    */

    public String toString(){
        return "Age: " + age + ". Weight: " + weight;
    }



    /* 
    //symbolic constants
    private final int MIN_AGE = 1;
    private final double MIN_WEIGHT = 3;

    //setter for age
    public void setAge(int a){
        if(a >= MIN_AGE){
            age = a;
        }
        else{
            age = MIN_AGE;
        }
    }    
    //getter for age

    //setter for weight

    //getter for weight
*/
}
