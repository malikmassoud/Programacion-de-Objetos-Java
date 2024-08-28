package Clinica;

import java.util.Scanner;

public class TestClinica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombrePaciente, nombreDoctor, especialidad, generoPaciente, nuevoGenero;
        double pesoPaciente, estaturaPaciente;
        int option, valorConsulta, edadPaciente;
        Doctor doctor = null;
        Paciente paciente1 = null;



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
                    System.out.println("Ingrese el genero del paciente: [Masculino] o [Femenino]");
                    generoPaciente = teclado.nextLine();
                    System.out.println("Ingrese la altura del paciente en centimetros: ");
                    estaturaPaciente = teclado.nextDouble();
                    System.out.println("\t***  Paciente creado correctamente   ***\n");
                    paciente1 = new Paciente(nombrePaciente, pesoPaciente, generoPaciente, estaturaPaciente);
                    teclado.nextLine();
                    System.out.println("\t*** Ingrese los datos del doctor  *** ");
                    System.out.println("Ingrese el nombre del doctor: ");
                    nombreDoctor = teclado.nextLine();
                    System.out.println("Ingrese la especialidad del doctor: ");
                    especialidad = teclado.nextLine();
                    System.out.println("Ingrese el valor de la consulta: ");
                    valorConsulta = teclado.nextInt();
                    doctor = new Doctor(nombreDoctor, especialidad, paciente1, valorConsulta);
                    System.out.println("\t***  Doctor creado satisfactoriamente  ***");

                    break;
                case 2:
                    if (doctor !=null){
                        System.out.println("\n\tDatos del paciente: ");
                        System.out.println("Nombre: " + doctor.getPaciente().getNombre());
                        System.out.println("Genero: " + doctor.getPaciente().getGenero());
                        System.out.println("Peso: " + doctor.getPaciente().getPesoKg());
                        System.out.println("Altura : "+ doctor.getPaciente().getEstaturaCm());
                        System.out.println("\n\tDatos del Doctor: ");
                        System.out.println("Nombre: " + doctor.getNombre());
                        System.out.println("Especialida: "+ doctor.getEspecialidad());
                        System.out.println("Valor consulta: " + doctor.getValorConsulta());
                    }else {
                        System.out.println("Debe crear un doctor **__**");
                    }

                    break;
                case 3:
                    if (doctor !=null){
                        System.out.println("Estado del Paciente: " + doctor.getPaciente().estadoPaciente());
                        System.out.println("Ingrese la edad del paciente: ");
                        edadPaciente = teclado.nextInt();
                        System.out.println("Metabolismo basal del Paciente: " + doctor.getPaciente().metabolismoBasal(edadPaciente));
                    }else {
                        System.out.println("Debe crear un doctor **__**");
                    }
                    break;
                case 4:
                    if (doctor !=null){
                        System.out.println("Total a pagar: " + doctor.totalAPagar());

                    }else {
                        System.out.println("Debe crear un doctor **__**");
                    }
                    break;
                case 5:
                    if (doctor !=null){
                        teclado.nextLine();
                        do {
                            System.out.println("Ingrese nuevo genero: ");
                            nuevoGenero = teclado.nextLine();
                        }while (nuevoGenero.compareToIgnoreCase(doctor.getPaciente().getGenero())==0);
                        doctor.getPaciente().setGenero(nuevoGenero);
                        System.out.println("***  Genero cambiado correcatemnte  ***");

                    }else {
                        System.out.println("Debe crear un doctor **__**");
                    }
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

