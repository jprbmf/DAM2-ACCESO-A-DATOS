package excepciones;

public class FechaNoValida extends RuntimeException {
    public FechaNoValida(String message) {
        super(message);
    }
}
