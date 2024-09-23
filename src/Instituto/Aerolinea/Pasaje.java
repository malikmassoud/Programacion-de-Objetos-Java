package Instituto.Aerolinea;

public class Pasaje {
    private String numPasaje;
    private String destino;
    private int valorBase;
    private int cantidadAbono;

    public Pasaje(String numPasaje, String destino, int valorBase, int cantidadAbono) {
        this.numPasaje = numPasaje;
        this.destino = destino;
        this.valorBase = valorBase;
        this.cantidadAbono = cantidadAbono;
    }

    public String getNumPasaje() {
        return numPasaje;
    }

    public void setNumPasaje(String numPasaje) {
        this.numPasaje = numPasaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    public int getCantidadAbono() {
        return cantidadAbono;
    }

    public void setCantidadAbono(int cantidadAbono) {
        this.cantidadAbono = cantidadAbono;
    }

    public void blackDays(){
        if (destino.toUpperCase().charAt(0)=='C')
        cantidadAbono = (int) (cantidadAbono *  1.15);
        else
            System.out.println("No tiene descuento *-*");
    }
}
