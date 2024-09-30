package Mascotas;

public class Perro {
    private String codigo;
    private String nombrePerro;
    private String nombreDueño;
    private int edad;

    public Perro(String codigo, String nombrePerro, String nombreDueño, int edad) {
        this.codigo = codigo;
        this.nombrePerro = nombrePerro;
        this.nombreDueño = nombreDueño;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String onomatopeya(){
        return "Guau guau";
    }

    public int añosReales(){
        return edad * 7;
    }

    public String saludo(){
        return "Saludos " + nombreDueño;
    }
}
