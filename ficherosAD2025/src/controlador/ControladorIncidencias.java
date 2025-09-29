package controlador;

import repositorio.Fichero;
import sevicio.ServicioFichero;
import vista.Escaner;

public class ControladorIncidencias {
    public static void iniciar(){
        Fichero miFichero = new Fichero(ruta"datos/incidencias.txt");
        ServicioFichero.guardar("incidencia 3");
    }
}
