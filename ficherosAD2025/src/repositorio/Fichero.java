package repositorio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fichero {

    private String ruta;

    public Fichero(String ruta){
        this.ruta = ruta;
    }
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Fichero{" + "ruta=" + ruta + '}';
    }

    public void addDato(String dato){
        //Añadir la linea al fichero
        Fichero f = new Fichero(dato);
    }
    public String buscarDato(LocalDate fechaInicial, LocalDate fechaFinal) {
        //
        return "";
    }
    public String buscarDato(String dato, int columna) {
        //
        return "";
    }
    public ArrayList<String> leerFichero(Strig dato){
        return null;
    }





}
