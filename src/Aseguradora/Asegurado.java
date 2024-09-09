package Aseguradora;

public class Asegurado {
    private String rut;
    private String direccion;
    private char tipoSeguro;

    public Asegurado(String rut, String direccion, char tipoSeguro) {
        this.rut = rut;
        this.direccion = direccion;
        this.tipoSeguro = tipoSeguro;
    }

    public String getRut() {
        return rut;
    }

    public char getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(char tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
