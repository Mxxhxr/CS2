package Oct31;

public class jackException extends Exception {
    private String m;

    public jackException(String p) {
    m = p;
    }

    public String toString() {
        return m;
    }
}
