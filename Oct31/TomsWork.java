package Oct31;

import java.util.Scanner;
public class TomsWork {

    public void Exec()throws jackException{
        double x,y;
        double k; //the double output of the method
        Scanner i = new Scanner(System.in);

        System.out.println("Enter numerator:");
        x = i.nextDouble();

        System.out.println("Enter denominator:");
        y = i.nextDouble();

        JacksWork j = new JacksWork();
        try {
            k = j.Div(x,y);
            System.out.println("k is " + k);
        }
        catch (jackException e) {
            System.out.println(e);
            
        }
        catch (Exception f){
            // extremem unexpected errors
        }
        finally {
            // resource releasing code
        }
        System.out.println("Goodbye");

    }

}



// put these exceptions in header if testing
// JacksWork j = new JacksWork();
        // try {
        //     k = j.Div(x,y);
        //     System.out.println("k is " + k);
        // }
        // catch (DivException e) {
        //     System.out.println("Cannot divide. The denominator cannot be 0.");
        // }
        // catch (NegException f) {
        //     System.out.println("Cannot divide. The numerator cannot be negative.");
        // }
    
