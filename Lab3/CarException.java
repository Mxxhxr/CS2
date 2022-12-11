package Lab3;

public class CarException extends Exception {

    private String message;

    public CarException(String error){
        message = error;
    }

    public String getMessage(){
        return message;
    }
    
}
