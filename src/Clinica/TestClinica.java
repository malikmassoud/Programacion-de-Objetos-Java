package Clinica;

import java.util.Scanner;

public class TestClinica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombrePaciente, nombreDoctor, especialidad, generoPaciente;
        double pesoPaciente, estaturaPaciente;
        int valorConsulta;
        Paciente paciente1 = null;

        int option;

        do {
            System.out.println("====== Clínica Olor a Clavel ======");
            System.out.println("1. Crear Doctor");
            System.out.println("2. Mostrar todos los datos (tanto del doctor como de su paciente)");
            System.out.println("3. Estado del Paciente y su Metabolismo Basal");
            System.out.println("4. Total a pagar");
            System.out.println("5. Modificar el género del paciente (validar que no sea el mismo que tenía)");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: \n");
            option = teclado.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\t*** Creacion de Doctor y Paciente\n");
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre del paciente: ");
                    nombrePaciente = teclado.nextLine();
                    System.out.println("Ingrese el peso en KG del paciente: ");
                    pesoPaciente = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ingrese el genero del paciente: ");
                    generoPaciente = teclado.nextLine();
                    System.out.println("Ingrese la altura del paciente en centimetros: ");
                    estaturaPaciente = teclado.nextDouble();
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2.");
                    // Código para la opción 2
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3");
                    // Código para la opción 3
                    break;
                case 4:
                    System.out.println("Has seleccionado la Opción 4");
                    break;
                case 5:
                    System.out.println("Has seleccionado la Opción 5");
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }

            System.out.println(); // Línea en blanco para separación

        } while (option != 6);

        teclado.close();
    }
}

