package excepciones;

public class NumeroNoValido extends RuntimeException {
    public NumeroNoValido(String message) {
        super(message);
    }
}
