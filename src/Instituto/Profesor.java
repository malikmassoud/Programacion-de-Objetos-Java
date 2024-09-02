package Instituto;

public class Profesor {
    private DatosPersonales datosPersonales;
    private Actividad actividad;
    private int valorHora;
    private int cantidadHorasClases;

    public Profesor(DatosPersonales datosPersonales, Actividad actividad, int cantidadHorasClases) {
        this.datosPersonales = datosPersonales;
        this.actividad = actividad;
        this.cantidadHorasClases = cantidadHorasClases;
        asignaValorHora();
    }

    public Profesor() {
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getCantidadHorasClases() {
        return cantidadHorasClases;
    }

    public void setCantidadHorasClases(int cantidadHorasClases) {
        this.cantidadHorasClases = cantidadHorasClases;
    }

    public void asignaValorHora(){
        if (datosPersonales.getGrado()=='T')
            valorHora=8500;
        if (datosPersonales.getGrado()=='L')
            valorHora=9500;
        if (datosPersonales.getGrado()=='M')
            valorHora=11500;
        if (datosPersonales.getGrado()=='D')
            valorHora=13500;
        if (datosPersonales.isCertificacionArea())
            valorHora=(int)(valorHora*1.4);
    }

    public void subirGrado(){
        if (datosPersonales.getGrado()=='T')
            datosPersonales.setGrado('L');

        if (datosPersonales.getGrado()=='L')
            datosPersonales.setGrado('M');

        if (datosPersonales.getGrado()=='M')
            datosPersonales.setGrado('D');

    }
}
