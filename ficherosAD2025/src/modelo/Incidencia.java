package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Incidencia {
    private String usuario;
    private String excepcion;
    private LocalDate fecha;
    private LocalTime hora;

    public Incidencia(String usuario, String excepcion, LocalDate fecha, LocalTime hora) {
        this.usuario = usuario;
        this.excepcion = excepcion;
        this.fecha = fecha;
        this.hora = hora;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getExcepcion() {
        return excepcion;
    }
    public void setExcepcion(String excepcion) {
        this.excepcion = excepcion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

}