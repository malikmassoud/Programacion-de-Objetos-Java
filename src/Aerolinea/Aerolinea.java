package Aerolinea;

import java.util.Scanner;

public class Aerolinea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option = 0;
        int valorBase, edad;
        double cantidadAbono;
        String numPasaje, destino, nombrePasajero;
        Pasaje pasaje = null;
        Pasajero pasajero = null;
         do {
             System.out.println("====== Aerolineas Alitas ahuecadas ======");
             System.out.println("1. Crear Pasajero");
             System.out.println("2. Mostrar todos los datos (Pasajero y Pasaje)");
             System.out.println("3. Valor de descuento y valor pasaje");
             System.out.println("4. Blackdays");
             System.out.println("5. Modificar la edad del pasajero (validar que no sea el mismo que tenía)");
             System.out.println("6. Salir");
             System.out.print("Seleccione una opción: \n");
             option = teclado.nextInt();

             switch (option){
                 case 1:
                     System.out.println("\t***  Crear Pasaje  ***");
                     teclado.nextLine();
                     System.out.println("Ingrese numero de pasaje: ");
                     numPasaje = teclado.nextLine();
                     System.out.println("Ingrese destino: ");
                     destino = teclado.nextLine();
                     System.out.println("Ingrese valor base: ");
                     valorBase = teclado.nextInt();
                     System.out.println("Ingrese el monto a abonar: ");
                     cantidadAbono = teclado.nextInt();

                     pasaje = new Pasaje(numPasaje, valorBase, cantidadAbono, destino);
                     System.out.println("\t***  PASAJE CREADO CORRECTAMENTE  *** ");
                     teclado.nextLine();

                     System.out.println("\t***  Crear pasajero  ***");
                     System.out.println("Ingrese el nombre del pasajero: ");
                     nombrePasajero = teclado.nextLine();
                     System.out.println("Ingrese la edad del pasajero: ");
                     edad = teclado.nextInt();

                     pasajero = new Pasajero(nombrePasajero, edad, pasaje);
                     System.out.println("***  PASAJERO CREADO CORRECTAMENTE  ***");

                     break;

                 case 2:
                     if (pasaje !=null){
                         System.out.println("Datos del pasaje: \t\n");

                         System.out.println("numero del pasaje: " + pasajero.getPasaje().getNumPasaje());
                         System.out.println("Destino de viaje: " + pasajero.getPasaje().getDestino());
                         System.out.println("Valor Base del vuelo: " + pasajero.getPasaje().getValorBase());
                         System.out.println("Cantidad de abono: " + Math.round(pasajero.getPasaje().getCantidadAbono()));

                         System.out.println("Datos del Pasajero: \t\n");
                         System.out.println("nombre del Pasajero: " + pasajero.getNombre());
                         System.out.println("Edad del Pasajero: " + pasajero.getEdad());

                     }else {
                         System.out.println("Debe crear un PASAJERO");
                     }
                     break;

                 case 3:
                     if (pasaje !=null){
                         System.out.println("Valor descuento : " + pasajero.descuento());
                         System.out.println("valor pasaje: " + pasajero.valorPasaje());

                     }else {
                         System.out.println("Debe crear un PASAJERO");
                     }
                     break;
                 case 4:
                     System.out.println("\tBienvenido al los BlackDays");
                     pasajero.getPasaje().blackDays();


             }


         }while (option != 6);


    }
}
