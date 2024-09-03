package Instituto;

public class DatosPersonales {
    private String nombre;
    private String rut;
    private char grado;
    private int añosInstitucion;
    private boolean certificacionArea;

    public DatosPersonales(String nombre, String rut, char grado, int añosInstitucion, boolean certificacionArea) {
        this.nombre = nombre;
        this.rut = rut;
        this.grado = Character.toUpperCase(grado);
        this.añosInstitucion = añosInstitucion;
        this.certificacionArea = certificacionArea;
    }

    public DatosPersonales() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public char getGrado() {
        return grado;
    }

    public void setGrado(char grado) {
        this.grado = Character.toUpperCase(grado);
    }

    public int getAñosInstitucion() {
        return añosInstitucion;
    }

    public void setAñosInstitucion(int añosInstitucion) {
        this.añosInstitucion = añosInstitucion;
    }

    public boolean isCertificacionArea() {
        return certificacionArea;
    }

    public void setCertificacionArea(boolean certificacionArea) {
        this.certificacionArea = certificacionArea;
    }

    public int aguinaldo(){
        if ((añosInstitucion>=3 && añosInstitucion<=5) && (grado == 'T' || grado=='L'))
            return 90000;
        if ((añosInstitucion>=6 && añosInstitucion<=8) && (grado == 'T' || grado=='M'))
            return 110000;
        if (añosInstitucion>8 && (grado=='L' || grado=='M'))
            return 130000;
        else
            return 0;
    }

}
