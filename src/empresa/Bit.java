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
        String rut, nombre, estadoCivil, cargo, buscadorRut;
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
                    empresa.ingresarTrabajador(trabajadores.add(trabajador));
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Ingrese el rut del trabajador");
                    buscadorRut = teclado.nextLine();
                    System.out.println(empresa.buscar(buscadorRut));
                    break;

                case 3:
                    break;

            }

        }while(op!=6);

    }
    
}
