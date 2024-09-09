package Aseguradora;

import java.util.Scanner;

public class TestAseguradora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, cantidadCuotas;
        String rutAsegurado, direccionAsegurado, numPoliza;
        char tipoSeguroAsegurado, nuevoTipoDeSeguro;
        boolean deducible;
        Asegurado asegurado = null;
        Poliza poliza = null;

        do {
            System.out.println("*** Menu Aseguradora ***");
            System.out.println("1. Crear Poliza. ");
            System.out.println("2. Mostrar Informacion de Poliza y Asegurado.");
            System.out.println("3. Mostrar Valor Poliza y Valor Cuota. ");
            System.out.println("4. Modificar Tipo De Seguro");
            System.out.println("5. Salir ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("\tCrear un Asegurado y su Poliza: ");
                    teclado.nextLine();
                    System.out.println("Ingrese el rut del afiliado: ");
                    rutAsegurado = teclado.nextLine();
                    System.out.println("Ingrese la direccion del Asegurado: ");
                    direccionAsegurado = teclado.nextLine();
                    System.out.println("Ingrese el tipo de Seguro [R]: Robo, [I]: Incendio,  [T]: Terremoto ");
                    tipoSeguroAsegurado = teclado.next().charAt(0);
                    asegurado = new Asegurado(rutAsegurado, direccionAsegurado, tipoSeguroAsegurado);
                    System.out.println("\tAsegurado creado exitosamente\n");


                    System.out.println("\tCrear Poliza: ");
                    teclado.nextLine();
                    System.out.println("Ingrese el numero de poliza: ");
                    numPoliza = teclado.nextLine();
                    System.out.println("Ingrese la cantidad de cuotas: ");
                    cantidadCuotas= teclado.nextInt();
                    System.out.println("Contiene deducible?");
                    deducible = teclado.nextBoolean();
                    poliza = new Poliza(numPoliza, cantidadCuotas, deducible, asegurado);
                    System.out.println("\tPoliza Creada correctamente");
                    break;
                case 2:
                    if (poliza!= null){
                        System.out.println("Datos de Poliza y Aseguradado");
                        System.out.println("\tAsegurado: ");
                        System.out.println("Rut asegurtado: " + poliza.getAsegurado().getRut());
                        System.out.println("Direccion de hogas del asegurado: " + poliza.getAsegurado().getDireccion());
                        System.out.println("Tipo de Seguro: " + poliza.getAsegurado().getTipoSeguro());

                        System.out.println("\tPoliza: ");
                        System.out.println("Numero de poliza: " + poliza.getNumPoliza());
                        System.out.println("Cantidad de cuotas: " + poliza.getCantidadCuotas());
                        System.out.println("Es asegurado: " + poliza.isDeducible());
                    }else
                        {
                            System.out.println("Debe crear una Poliza primero xd");
                        }

                    break;

                case 3:
                    if (poliza != null){
                        System.out.println("Valor Poliza: " +  poliza.valorPoliza());
                        System.out.println("Valor cuota: " +  poliza.valorCuota());
                    }else {
                        System.out.println("Ingrese una poliza primero xd");
                    }
                    break;

                case 4:
                    if (poliza != null){
                        System.out.println("Cambio de tipo de Seguro");
                        System.out.println("Ingrese el nuevo tipo de seguro: ");
                        nuevoTipoDeSeguro = teclado.next().charAt(0);
                        poliza.getAsegurado().setTipoSeguro(nuevoTipoDeSeguro);
                    } else {
                        System.out.println("Debe crear una poliza primero xd");
                    }
                    break;

                default:
                    System.out.println("Ingrese un numero Valido xd");


            }
        } while (opcion!=5);
    }
}
