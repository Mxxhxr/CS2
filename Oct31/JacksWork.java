package Oct31;

public class JacksWork {

    public double Div(double n, double d) throws jackException {

        if (n <= 0) {
            throw new jackException("Cannot divide. Numerator has to be positive.");
        }
        if (d == 0){
            throw new jackException("Cannot divide. Denominator cannot be zero.");
        }
        return n / d;


    }
    
}



// // 1st exception
        // if (d == 0) {
        //     throw new DivException();
        // }
        // // 2nd exception
        // if (n <= 0) {
        //     throw new NegException();
        // }
        
        // return n / d;