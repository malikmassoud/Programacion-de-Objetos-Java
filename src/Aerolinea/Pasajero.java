package Aerolinea;

public class Pasajero {
    private String nombre;
    private int edad;
    private Pasaje pasaje;

    public Pasajero(String nombre, int edad, Pasaje pasaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.pasaje = pasaje;
    }

    public Pasajero() {
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double descuento(){
        if (edad<6)
            return pasaje.getCantidadAbono() * 0.2;
        if (pasaje.getCantidadAbono()>200000)
            return pasaje.getCantidadAbono() * 0.15;


        return 0;
    }

    public double valorPasaje(){
        return pasaje.getValorBase() - pasaje.getCantidadAbono() - descuento();
    }


}
