package Mascotas;

public class Gato {
    private String codigo;
    private String nombreGato;
    private String nombreDueño;
    private int cantidadDeVidas;

    public Gato(String codigo, String nombreGato, String nombreDueño, int cantidadDeVidas) {
        this.codigo = codigo;
        this.nombreGato = nombreGato;
        this.nombreDueño = nombreDueño;
        this.cantidadDeVidas = cantidadDeVidas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreGato() {
        return nombreGato;
    }

    public void setNombreGato(String nombreGato) {
        this.nombreGato = nombreGato;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getCantidadDeVidas() {
        return cantidadDeVidas;
    }

    public void setCantidadDeVidas(int cantidadDeVidas) {
        this.cantidadDeVidas = cantidadDeVidas;
    }

    public String onomatopeya(){
        return "Miaaau";
    }

    public String saludo(){
        return "Saludos " + nombreDueño;
    }
}
