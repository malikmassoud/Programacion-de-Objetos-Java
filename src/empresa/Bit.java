/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DOCENTE
 */
public class Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        DatosPersonales datosPersonales = new DatosPersonales();
        DatosPersonales datosPersonales2 = new DatosPersonales();

        Trabajador trabajador = new Trabajador();
        Trabajador trabajador2 = new Trabajador();

        Empresa empresa = new Empresa();
        ArrayList <Trabajador> trabajadores=new ArrayList<Trabajador>();



        datosPersonales.setNombre("Paulo");
        datosPersonales.setRut("203885660");
        datosPersonales.setEstadoCivil("Casado");

        datosPersonales2.setNombre("Sofia Cenzano");
        datosPersonales2.setRut("1467864639");
        datosPersonales2.setEstadoCivil("Casado");

        System.out.println(datosPersonales.toString());
        System.out.println(datosPersonales2.toString());

        trabajador.setCargo("Profesional");
        trabajador.setDatos(datosPersonales);
        trabajador.setCantidadHorasNormales(45);
        trabajador.setCantidadHorasExtras(10);

        trabajador2.setCargo("Profesional");
        trabajador2.setDatos(datosPersonales2);
        trabajador2.setCantidadHorasNormales(45);
        trabajador2.setCantidadHorasExtras(10);

        System.out.println(trabajador.toString());
        System.out.println(trabajador2.toString());

        trabajadores.add(trabajador);
        trabajadores.add(trabajador2);

        empresa.setTrabajadores(trabajadores);
        System.out.println(empresa.cantidadProfesionales());
        System.out.println(empresa.cantidadDePersonasCasadas());
    }
    
}
