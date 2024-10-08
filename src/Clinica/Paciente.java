package Clinica;

public class Paciente {
    private String nombre;
    private double pesoKg;
    private String genero;
    private double estaturaCm;

    public Paciente(String nombre, double pesoKg, String genero, double estaturaCm) {
        this.nombre = nombre;
        this.pesoKg = pesoKg;
        this.genero = genero;
        this.estaturaCm = estaturaCm;
    }

    public Paciente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getEstaturaCm() {
        return estaturaCm;
    }

    public void setEstaturaCm(double estaturaCm) {
        this.estaturaCm = estaturaCm;
    }

    public double imc(){
        return pesoKg/Math.pow(estaturaCm/100,2);
    }

    public String estadoPaciente(){
        if (imc()>=18.5 && imc()<25)
            return "Normal";

        if (imc()>=25 && imc()<30)
            return "Sobrepeso";

        if (imc()>30)
            return "obeso";

        return "delgado";

    }

    public double metabolismoBasal(int edad){
        if (genero.compareToIgnoreCase("Masculino")==0){
            return (pesoKg*10)+(6.25*estaturaCm)-(5*edad) + 5;
        }
        return (pesoKg*10)+(6.25*estaturaCm)-(5*edad) + 5;
    }
}
