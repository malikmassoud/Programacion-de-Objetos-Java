package Instituto;

import java.util.Scanner;

public class TestInstituto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, añosInstitucion, cantidadHoras, cantidadHorasClases;
        String nombre, rut, nombreActividad, tipoActividad;
        char grado;
        boolean certificacion;
        DatosPersonales datosPersonales = null;
        Actividad actividad = null;
        Profesor profesor = null;
        do {
            System.out.println("\t**** Menu de Instituto ****");
            System.out.println("1.\tCrear Profesor");
            System.out.println("2.\tInformación (Mostrará el Nombre del profesor, grado, tipo de actividad y valor hora)");
            System.out.println("3.\tAguinaldo");
            System.out.println("4.\tSueldo");
            System.out.println("5.\tAumentar horas (método) Mostrar mensaje adecuado");
            System.out.println("6.\tSubir grado indicando en cual quedó");
            System.out.println("7.\tModificar la cantidad de horas de clases (debe validar que no sea la misma que tenía)");
            System.out.println("8. Salir");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    teclado.nextLine();

                    System.out.println("\t**** Creacion de los Datos Personales ****");
                    System.out.println("Ingrese el nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el rut: ");
                    rut = teclado.nextLine();
                    System.out.println("Ingrese el grado: [T]: Téctino [L]: Licenciado [M]: Magister [D]: Doctor");
                    grado = teclado.next().charAt(0);
                    System.out.println("Años en la institucion: ");
                    añosInstitucion = teclado.nextInt();
                    System.out.println("Posee certificacion en el area [T] true [F] false");
                    certificacion = teclado.nextBoolean();
                    datosPersonales = new DatosPersonales(nombre, rut, grado, añosInstitucion, certificacion);
                    System.out.println("Datos Personales Creados Correctamete");

                    teclado.nextLine();

                    System.out.println("\t**** Crear Actividad ****");

                    System.out.println("Nombre de la actividad: ");
                    nombreActividad = teclado.nextLine();
                    System.out.println("Ingrese el tipo de actividad: (Encargo, ejecución práctica o ejercicio) ");
                    tipoActividad = teclado.nextLine();
                    System.out.println("Ingrese cantidad de horas para el desarrollo de la actividad: ");
                    cantidadHoras = teclado.nextInt();
                    actividad = new Actividad(nombreActividad, tipoActividad, cantidadHoras);
                    System.out.println("Creacion de actividad correctamente");

                    System.out.println("\t**** Creacion de Profesor ****");
                    System.out.println("Cantidad de horas clase: ");
                    cantidadHorasClases = teclado.nextInt();
                    profesor = new Profesor(datosPersonales, actividad, cantidadHorasClases);
                    System.out.println("*** Profesor Creado Correctamente ***");
                    break;
                case 2:
                    if (profesor!=null){
                        System.out.println("informacion");
                        System.out.println("Nombre Profesor: " + profesor.getDatosPersonales().getNombre());
                        System.out.println("Rut Profesor: " + profesor.getDatosPersonales().getRut());
                        System.out.println("Grado del Profesor: " + profesor.getDatosPersonales().getGrado());
                        System.out.println("Actividad del Profesor: " + profesor.getActividad().getTipo());
                        System.out.println("Valor de Hora: " + profesor.getValorHora());
                    }else
                        System.out.println("Debe crear un profesor antes de elegir esta opcion: ");
                    break;
                case 3:
                    if (profesor != null) {
                        System.out.println("Usted recibira un aguinaldo de: $" + profesor.getDatosPersonales().aguinaldo());
                    }











            }


        }while (opcion!=6);
    }
}
