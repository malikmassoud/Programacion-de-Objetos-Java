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
        int op, cantidadHorasExtras, cantidadHorasNormales;
        String rut, nombre, estadoCivil, cargo, buscadorRut, eliminarRut;
        DatosPersonales datosPersonanles = null;
        Trabajador trabajador = null;
        Empresa empresa = new Empresa();
        ArrayList <Trabajador> trabajadores=new ArrayList<Trabajador>();

        do {
            System.out.println("Menu Bit & Bit");
            System.out.println("1. Ingresar Trabajador");
            System.out.println("2. Mostrar los datos del trabajador X");
            System.out.println("3. Cantidade de profesionales");
            System.out.println("4. Nombre y rut del trabajador con mayor sueldo bruto");
            System.out.println("5. Eliminar un trabajador");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion: ");
            op= teclado.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingresar Trabajador:");
                    teclado.nextLine();
                    System.out.println("***Primero Datos Personales del Trabajador***");
                    System.out.println("Rut: ");
                    rut = teclado.nextLine();
                    System.out.println("Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Estado Civil: ");
                    estadoCivil = teclado.nextLine();
                    System.out.println("Cargo: ");
                    cargo = teclado.nextLine();
                    System.out.println("Cantidad de horas normales:  ");
                    cantidadHorasNormales = teclado.nextInt();
                    System.out.println("cantidad de horas extras: ");
                    cantidadHorasExtras=teclado.nextInt();
                    datosPersonanles = new DatosPersonales(rut, nombre,estadoCivil);
                    trabajador = new Trabajador(cargo,datosPersonanles,cantidadHorasNormales,cantidadHorasExtras);
                    System.out.println(empresa.ingresarTrabajador(trabajador));

                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Ingrese el rut del trabajador");
                    buscadorRut = teclado.nextLine();
                    int elTrabajador = empresa.buscar(buscadorRut);
                    if(elTrabajador == -1){
                        System.out.println("El trabajador no existe");
                    }else {
                        System.out.println("Rut del Trabajador: " + empresa.getTrabajadores().get(elTrabajador).getDatos().getRut());
                        System.out.println("Nombre del Trabajador: " + empresa.getTrabajadores().get(elTrabajador).getDatos().getNombre());
                        System.out.println("Estado Civil del Trabajador: " + empresa.getTrabajadores().get(elTrabajador).getDatos().getEstadoCivil());
                        System.out.println("Cargo del Trabajador: " + empresa.getTrabajadores().get(elTrabajador).getCargo());
                    }

                    System.out.println(empresa.mostrarDatos(buscadorRut));
                    break;
                case 3:
                    System.out.println("Cantidad de trabajadores bajo el cargo de profesionale son: " + empresa.cantidadProfesionales());
                    break;
                case 4:
                    int pos=empresa.mayorSueldoBruto();
                    if (pos==-1){
                        System.out.println("¡¡¡La empresa no tiene trabajadores!!!");
                    } else {
                        System.out.println("Trabajador mayor sueldo bruto: ");
                        System.out.println("Nombre: " + empresa.getTrabajadores().get(pos).getDatos().getNombre());
                        System.out.println("Rut: " + empresa.getTrabajadores().get(pos).getDatos().getRut());
                        System.out.println("Sueldo Bruto: " + empresa.getTrabajadores().get(pos).sueldoBruto());

                    }
                case 5:
                    System.out.println("Ingrese el rut del trabajador que quiere elimianr: ");
                    teclado.nextLine();
                    eliminarRut = teclado.nextLine();
                    System.out.println(empresa.eliminarTrabajador(eliminarRut));
                    break;

            }

        }while(op!=6);

    }
    
}
