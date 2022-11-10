package Oct5;

public class catClient {
    public static void main(String[] args){
        //Make a cat object using default constructor
        Cat x = new Cat();
        System.out.println("Cat x created.");
        System.out.println("Weight: " + x.getWeight());
        System.out.println("Feet: " + x.getFeet());

        
        Cat y = new Cat();
        y.setFeet(6);
        y.setWeight(200);
        System.out.println("Cat y created.");
        System.out.println("Weight: " + y.getWeight());
        System.out.println("Feet: " + y.getFeet());

        Cat z = new Cat(300, 7);
        System.out.println("Cat z created.");
        System.out.println("Weight: " + z.getWeight());
        System.out.println("Feet: " + z.getFeet());
    }
    
}
