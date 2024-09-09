package Aseguradora;

public class Poliza {
    private String numPoliza;
    private int cantidadCuotas;
    private boolean deducible;
    private Asegurado asegurado;

    public Poliza(String numPoliza, int cantidadCuotas, boolean deducible, Asegurado asegurado) {
        this.numPoliza = numPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.deducible = deducible;
        this.asegurado = asegurado;
    }

    public String getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public boolean isDeducible() {
        return deducible;
    }

    public void setDeducible(boolean deducible) {
        this.deducible = deducible;
    }

    public Asegurado getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(Asegurado asegurado) {
        this.asegurado = asegurado;
    }

    public int valorPoliza(){

        if (asegurado.getTipoSeguro()=='R')
            return (int) (8.2 * 37000);
        if (asegurado.getTipoSeguro()=='I')
            return (int) (25.6 * 37000);
        if (asegurado.getTipoSeguro()=='T')
            return (int) (28.7 * 37000);
        else
            return (int) 31.5;

    }

    public int valorCuota(){
        if (deducible== false)
            return (valorPoliza() / cantidadCuotas) + (int) (0.5 * 37000) ;
        else
            return (valorPoliza() / cantidadCuotas);

    }
}
