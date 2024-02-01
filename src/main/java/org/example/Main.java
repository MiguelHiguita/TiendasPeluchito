package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreUsuario;
        String cedulaUsuario;
        Integer opcion;
        Integer cantidadProducto;
        Double costoTotal=0.0;
        Double granTotal=0.0;
        Scanner leer = new Scanner(System.in);

        System.out.println("******Tiendas Peluchito******");
        System.out.println("1. Cumpleaños");
        System.out.println("2. Dia de la mujer");
        System.out.println("3. BabyShower");
        System.out.println("4. Salir");

        do {
            System.out.println("digita la opcion deseada: ");
            opcion = leer.nextInt();

            if (opcion==1){
                System.out.println("Digita la cantidad de kit de Cumpleaños que deseas: ");
                cantidadProducto = leer.nextInt();
                costoTotal=180000.0*cantidadProducto;
                granTotal=granTotal+costoTotal;
            } else if (opcion==2) {
                System.out.println("Digita la cantidad de kit de mujer que deseas: ");
                cantidadProducto = leer.nextInt();
                costoTotal=60000.0*cantidadProducto;
                granTotal=granTotal+costoTotal;
            } else if (opcion==3) {
                System.out.println("Digita la cantidad de kit de BabyShower que deseas: ");
                cantidadProducto = leer.nextInt();
                costoTotal=250000.0*cantidadProducto;
                granTotal=granTotal+costoTotal;
            } else if (opcion==4) {
                System.out.println("Muchas gracias, hasta pronto");
            }else {
                System.out.println("Digita una opcion valida");
            }
        }while(opcion!=4);
        System.out.println("El costo es de: "+granTotal);

    }

}