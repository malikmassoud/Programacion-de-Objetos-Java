/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author DOCENTE
 */
public class Trabajador {
    private String cargo;
    private DatosPersonales datos;
    private int cantidadHorasNormales;
    private int cantidadHorasExtras;

    public Trabajador(String cargo, DatosPersonales datos, int cantidadHorasNormales, int cantidadHorasExtras) {
        this.cargo = cargo;
        this.datos = datos;
        this.cantidadHorasNormales = cantidadHorasNormales;
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    public Trabajador() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public DatosPersonales getDatos() {
        return datos;
    }

    public void setDatos(DatosPersonales datos) {
        this.datos = datos;
    }

    public int getCantidadHorasNormales() {
        return cantidadHorasNormales;
    }

    public void setCantidadHorasNormales(int cantidadHorasNormales) {
        this.cantidadHorasNormales = cantidadHorasNormales;
    }

    public int getCantidadHorasExtras() {
        return cantidadHorasExtras;
    }

    public void setCantidadHorasExtras(int cantidadHorasExtras) {
        this.cantidadHorasExtras = cantidadHorasExtras;
    }
    
    public int valorHora()
    {
        if(cargo.compareToIgnoreCase("supervisor")==0)
            return 18500;
        if(cargo.compareToIgnoreCase("profesional")==0)
            return 15700;
        if(cargo.compareToIgnoreCase("tecnico")==0)
            return 12000;
        return 10000;
    }
    
    public int sueldoBruto(){
        return (int)(cantidadHorasNormales*valorHora()+cantidadHorasExtras*valorHora()*1.5);
    }

}
