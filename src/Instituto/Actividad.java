package Instituto;

public class Actividad {
    private String nombreActividad;
    private String tipo;
    private int cantidadHoras;

    public Actividad(String nombreActividad, String tipo, int cantidadHoras) {
        this.nombreActividad = nombreActividad;
        this.tipo = tipo;
        this.cantidadHoras = cantidadHoras;
    }

    public Actividad() {
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public void aumentarHoras(){
        if (tipo.compareToIgnoreCase("Encargo")==0)
            cantidadHoras = (int)(cantidadHoras * 1.40);
    }
}
