package Aerolinea;

public class Pasajero {
    private String nombre;
    private int edad;
    private Pasaje pasaje;

    public Pasajero(String nombre, int edad,Pasaje pasaje){
        this.nombre = nombre;
        this.edad = edad;
        this.pasaje = pasaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    public int descuento(){
        double descuentoAbono = 0;
        if (edad < 6 ){
            descuentoAbono = pasaje.getCantidadAbono() * 1.20;
            return (int)descuentoAbono ;
        }
        if (pasaje.getCantidadAbono()>=200000){
            descuentoAbono = pasaje.getCantidadAbono() * 1.15;
            return (int) descuentoAbono;
        }
        else
            return 0;

    }

    public int valorPasaje(){
        return pasaje.getValorBase() - pasaje.getCantidadAbono() - descuento();
    }
}
