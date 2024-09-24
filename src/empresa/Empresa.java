/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author DOCENTE
 */
public class Empresa {
    private ArrayList <Trabajador> trabajadores=new ArrayList<Trabajador>();

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    public int buscar(String rut)
    {
        for (int i = 0; i < trabajadores.size(); i++) {
           if(rut.compareToIgnoreCase(trabajadores.get(i).getDatos().getRut())==0) 
               return i;
        }
        return -1;
    }
    
    public String ingresarTrabajador(Trabajador traba)
    {
        if(buscar(traba.getDatos().getRut())==-1)
        {
            trabajadores.add(traba);
            return "\n\tTrabajador ingresado al sistema";
        }
        return "\n\tTrabajador ya existe en la empresa... no se puede reingresar";
    }
    
    public String eliminarTrabajador(String rut)
    {
        int pos=buscar(rut);
        if(pos==-1)
            return "\n\tNo se puede desvincular... Trabajador no existe";
        trabajadores.remove(pos);
        return "\n\tTrabajador desvinculado de la empresa";
    }
    
    public int cantidadProfesionales()    {
        int cont=0;
        for (int i = 0; i < trabajadores.size(); i++) {
            if(trabajadores.get(i).getCargo().compareToIgnoreCase("profesional")==0)
                cont++;
        }
        return cont;
                
    }
            
    public int mayorSueldoBruto()
    {
        int pos=-1, may=0;
        for (int i = 0; i < trabajadores.size(); i++) {
            if(trabajadores.get(i).sueldoBruto()>may)
            {
                may=trabajadores.get(i).sueldoBruto();
                pos=i;
            }
        }
        return pos;
    }

    public int cantidadDePersonasCasadas(){
        int conta=0;
        for (int i = 0; i < trabajadores.size(); i++){
            if (trabajadores.get(i).getDatos().getEstadoCivil().compareToIgnoreCase("Casado") == 0)
                conta++;

        }
        return conta;
    }

    public String mostrarDatos(String rut){

        int pos = buscar(rut);
        if (pos == -1)
            return "El trabajador no existe";
        else
        {
            return "\n\tDatos del Trabajador"
                   + "\nNombre: " + trabajadores.get(pos).getDatos().getNombre() +
                    "\nRut: " +trabajadores.get(pos).getDatos().getRut() +
                    "\nEstado Civil: " + trabajadores.get(pos).getDatos().getEstadoCivil() +
                    "\nCargo: " + trabajadores.get(pos).getCargo() +
                    "\nCantidad de horas trabajadas: " + trabajadores.get(pos).getCantidadHorasNormales() +
                    "\nCantidad de horas extras: " + trabajadores.get(pos).getCantidadHorasExtras();

        }
    }

    public String mostrarDatitos(String rut){
        int pos=buscar(rut);
        if (pos==-1){
            return "\n\tTrabajador no existe.....";
        } else {
            return trabajadores.get(pos).mostrarDatos();
        }
    }
    


    
    
}
