package Oct19;

public class dogClient {
    public static void main(String[] args){
        yell();
        System.gc();
        System.runFinalization();

    }
    
    public static void yell(){

        Dog x = new Dog(2.3, 21.9);
        Dog y = new Dog(0.5, 1.7);
    }
}
