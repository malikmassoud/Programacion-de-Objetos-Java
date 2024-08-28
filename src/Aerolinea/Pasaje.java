package Aerolinea;

import java.util.Locale;

public class Pasaje {
    private String numPasaje;
    private String destino;
    private int valorBase;
    private double cantidadAbono;

    public Pasaje(String numPasaje, int valorBase, double cantidadAbono, String destino) {
        this.numPasaje = numPasaje;
        this.valorBase = valorBase;
        this.cantidadAbono = cantidadAbono;
        this.destino = destino;
    }

    public Pasaje() {
    }

    public double getCantidadAbono() {
        return cantidadAbono;
    }

    public void setCantidadAbono(double cantidadAbono) {
        this.cantidadAbono = cantidadAbono;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNumPasaje() {
        return numPasaje;
    }

    public void setNumPasaje(String numPasaje) {
        this.numPasaje = numPasaje;
    }

    public void blackDays(){
        if (destino.toUpperCase().charAt(0) == 'C' ){
            System.out.println("Tiene Bono");
            cantidadAbono = cantidadAbono * 1.15;
            System.out.println("Su cantidad de abono incremento un 15% :D  " + Math.round(cantidadAbono));
        } else {
            System.out.println("No tiene bono :(");
        }

    }

}
