package vehiculo;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author 503
 */
public class Vehiculo {
    private String placa;
    private String fechaEntrada;
    private String fechaSalida;
    private int cedula;
    private String nombre;
    private String apellido;
    private int fijo;
    private int movil;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    
    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFijo() {
        return fijo;
    }

    public void setFijo(int fijo) {
        this.fijo = fijo;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public Vehiculo() {
    }
    
    public Vehiculo(String placa, String fechaEntrada, String fechaSalida, int cedula, String nombre, String apellido, int fijo, int movil) {
        this.placa = placa;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fijo = fijo;
        this.movil = movil;
    }
}

