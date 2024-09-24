package Taxis;

public class Taxi {
    private String patente;
    private String jornada;
    private int valorBase; //Valor que se suma cada 200 metros.
    private int valorBajadaBandera; //Valor base por subirse al taxi
    private int metrosRecorridos;

    public Taxi(String patente, String jornada, int valorBase, int valorBajadaBandera, int metrosRecorridos) {
        this.patente = patente;
        this.jornada = jornada;
        this.valorBase = valorBase;
        this.valorBajadaBandera = valorBajadaBandera;
        this.metrosRecorridos = metrosRecorridos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getMetrosRecorridos() {
        return metrosRecorridos;
    }

    public void setMetrosRecorridos(int metrosRecorridos) {
        this.metrosRecorridos = metrosRecorridos;
    }

    public int getValorBajadaBandera() {
        return valorBajadaBandera;
    }

    public void setValorBajadaBandera(int valorBajadaBandera) {
        this.valorBajadaBandera = valorBajadaBandera;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int recargo(){
        if (jornada.compareToIgnoreCase("Mañana")==0)
            return (int) (valorBase*0.08);
        if (jornada.compareToIgnoreCase("Tarde")==0)
            return (int) (valorBase*0.14);
        else {
            return (int)(valorBase*0.20);

        }

    }

    public int totalGanado(){
        return valorBajadaBandera + (metrosRecorridos/200) * (valorBase + recargo());
    }
}
