package Clinica;

import java.util.Scanner;

public class TestClinica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombrePaciente, nombreDoctor, especialidad, genero;
        double pesoPaciente, estaturaPaciente;
        int valorConsulta;
        Paciente paciente;

        int option;

        do {
            System.out.println("====== Clínica Olor a Clavel ======");
            System.out.println("1. Crear Doctor");
            System.out.println("2. Mostrar todos los datos (tanto del doctor como de su paciente)");
            System.out.println("3. Estado del Paciente y su Metabolismo Basal");
            System.out.println("4. Total a pagar");
            System.out.println("5. Modificar el género del paciente (validar que no sea el mismo que tenía)");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            option = teclado.nextInt();

            switch (option) {
                case 1:
                    Paciente paciente1 = new Paciente("Malik", 55.4,"Masculino", 177);
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre del doctor: ");
                    nombreDoctor = teclado.nextLine();
                    System.out.println("Ingrese la especialidad del doctor: ");
                    especialidad = teclado.nextLine();
                    System.out.println("Ingresar el valor de la consulta: ");
                    valorConsulta = teclado.nextInt();
                    break;
                case 2:
                    if (paciente1==null){

                    }
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

