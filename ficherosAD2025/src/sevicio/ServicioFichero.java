package sevicio;

import modelo.Incidencia;
import repositorio.Fichero;

public class ServicioFichero {
    public static void guardar(String incidencia){
        Incidencia incidencia1 = new Incidencia(incidencia);
        Fichero miFichero = new Fichero(datos/);

        miFichero.addDato(incidencia);

    }
}
