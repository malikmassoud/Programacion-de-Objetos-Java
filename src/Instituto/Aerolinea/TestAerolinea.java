package Instituto.Aerolinea;

import java.util.Scanner;

public class TestAerolinea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option;
        String numPasaje, destino, nombre;
        int valorBase, cantidadAbono, edad;
        Pasaje pasaje = null;
        Pasajero pasajero = null;

        do {
            System.out.println("\t Menu aerolinea");
            System.out.println("1. Crear Pasajero");
            System.out.println("2. Datos (mostrará todos los datos del pasajero incluyendo los del pasaje)");
            System.out.println("3. Valor de descuento y valor pasaje");
            System.out.println("4. BlackDays");
            System.out.println("5. Modificar la edad del pasajero (Validando que no sea la misma que tenía)");
            System.out.println("6. Salir del programa...");
            option = teclado.nextInt();
            switch (option){
                case 1:
                    System.out.println("\t***Crear Pasaje***");
                    teclado.nextLine();
                    System.out.println("Ingrese el numero del pasaje: ");
                    numPasaje = teclado.nextLine();
                    System.out.println("Ingrese el Destino del Pasaje: ");
                    destino = teclado.nextLine();
                    System.out.println("Ingrese el valor base del pasaje: ");
                    valorBase = teclado.nextInt();
                    System.out.println("Ingrese la cantidad que desea abonar: ");
                    cantidadAbono = teclado.nextInt();
                    pasaje = new Pasaje(numPasaje, destino, valorBase,cantidadAbono);
                    System.out.println("\t*** PASAJE CREADO CORRECTAMENTE ***");
                    teclado.nextLine();
                    System.out.println("\t***Crear Pasajero ***");
                    System.out.println("Ingrese el nombre del pasajero: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese la edad del pasajero: ");
                    edad = teclado.nextInt();
                    pasajero = new Pasajero(nombre, edad, pasaje);
                    System.out.println("\t*** PASAJERO CREADO CORRECTAMENTE ***\n");
                    break;
                case 2:
                    if (pasaje!=null){
                        System.out.println("\tDatos del Pasaje: ");
                        System.out.println("Numero del Vuelo: " + pasajero.getPasaje().getNumPasaje());
                        System.out.println("Destino del vuelo: " + pasajero.getPasaje().getDestino());
                        System.out.println("Valor del vuelo: " + pasajero.getPasaje().getValorBase());
                        System.out.println("cantidad de dinero abonado para el viaje: " + pasajero.getPasaje().getCantidadAbono());

                        System.out.println("\tDatos del Pasajero: ");
                        System.out.println("Nombre del pasajero: " + pasajero.getNombre());
                        System.out.println("Edad del pasajero: " + pasajero.getEdad());
                    }else
                        System.out.println("Debe crear un Pasajero primero *-*");
                    break;
                case 3:
                    if (pasaje!=null){
                        System.out.println("La cantidad de descuento en el abono es de: " + pasajero.descuento());
                        System.out.println("La cantidad total a pagar es de: " + pasajero.valorPasaje());
                    }else {
                        System.out.println("Debe crear un Pasajero primero *-*");
                    }

                    break;
                case 4:
                    if (pasaje!=null){
                        System.out.println("Promociones de BlackDays: ");
                        pasajero.getPasaje().blackDays();
                        System.out.println("Se ha aumentado su cantidad de abono en: " + pasajero.getPasaje().getCantidadAbono());

                    }else {

                    }
                    break;
                case 5:
                    System.out.println("Haz elegido la cuarta opcion");
                    break;
                case 6:
                    System.out.println("Saliendo del porgrama.....");
                default:
                    System.out.println("Ingrese una opcion valida *-*");
                    break;
            }
        }while (option!= 6);


    }
}
