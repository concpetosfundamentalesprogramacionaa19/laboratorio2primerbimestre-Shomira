/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportedemolab2;

import java.util.Scanner;

/**
 *
 * @author FJTAMATTSH
 */
public class Reportedemolab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Desarrollar una aplicación en Java que permita ingresar información
         * de varios padres de familia. La información que se necesita por cada
         * padre de familia es:
         *
         * Nombres y apellidos del padre de familia. Sueldo semanal del padre de
         * familia. Número de hijos del padre de familia Por cada hijo se debe
         * preguntar el gasto semanal que tienen para: pasajes, bar, salidas
         */
        Scanner teclado = new Scanner(System.in);
        //Iniciaizacion necesaria de ciertas variables
        String salida = "";
        boolean datos = true;
        int cont = 1;
        int rep = 001;
        String mensaje;

        //Otorgar primeros valor del encabezado en el system.format
        salida = String.format("%sReporte Gastos Padres de Familia\n\n", salida);
        salida = String.format("%sReporte:00%d\n\n", salida, rep);

        while (datos) {
            /**
             * Inicializacion de variables dentro del ciclo ,entonces si se
             * repite el bucle su valor valor inicie en 0
             */
            double totalP = 0;
            double totalB = 0;
            double totalS = 0;
            double gastoTotal = 0;
            //Entrada de Datos del Padre de Familia,nombre,#hijos, sueldo
            System.out.print("Ingrese Nombres y Apellidos del Padre de Familia:"
                    + " ");
            String nom_ap = teclado.nextLine();

            System.out.print("Ingrese el sueldo del padre de familia: ");
            double sueldo = teclado.nextDouble();

            System.out.println("Ingrese el numero de hijos del padre de familia"
                    + ": ");
            int num_hj = teclado.nextInt();
            //Actualizacion de datos en el Strin.format, para mostrar en pantall
            salida = String.format("%sNombre Padre de Familia: %s\nSueldo"
                    + " Semanal: $%.0f\nNumero de Hijos:%d\n\n Persona\t"
                    + "Pasaje\t\t Bar\t\t Salidas\n\n  ", salida, nom_ap,
                    sueldo, num_hj);
            //Segun el numero de hijos el bucle preguntara los datos
            while (cont <= num_hj) {
                //Entrada de datos en los Gastos delos Hijos,Pasajes,Bar,Salidas
                System.out.println("Ingreso de gastos semanal de Hijo"
                        + cont + " en : PASAJES, BAR, SALIDAS ");

                System.out.println("Gastos en pasajes del hijo" + cont + ": ");
                double pasajes = teclado.nextDouble();

                System.out.println(" Gastos de bar del hijo" + cont + " : ");
                double bar = teclado.nextDouble();

                System.out.println("Gastos en salidas del hijo" + cont + " : ");
                double salidas = teclado.nextDouble();

                salida = String.format("%sHijo%d\t\t %.1f\t\t"
                        + "%.1f\t\t %.1f\n\n ", salida, cont, pasajes, bar,
                        salidas);
                cont = cont + 1;
                totalP = totalP + pasajes;
                totalB = totalB + bar;
                totalS = totalS + salidas;
                gastoTotal = totalP + totalB + totalS;
            }
            // Sueldo y gastos determinar si le falta o alcanza el dinero
            if (gastoTotal > sueldo) {
                mensaje = ("El padre de familia " + nom_ap + " le falta"
                        + " el dinero semanal, para sus gastos");
            } else {
                mensaje = ("El padre de familia " + nom_ap + " le alcanza "
                        + "el dinero semanal, para sus gastos");
            }
            //Agregacion de la variable mensaje en el String Format
            salida = String.format("%sTotales\t %.1f\t\t %.1f\t\t "
                    + "%.1f\t \n\n Fin Reporte:00%d \n\n %s\n\n", salida,
                    totalP, totalB, totalS, rep, mensaje);
            /**
             * El usuario debe determinar cuando termina el programa por lo
             * tanto se realiza la siguiente pregunta 
             *
             */
            System.out.println("Ingrese 's' si dese seguir y 'n si desea salir'");
            String opcion = teclado.next();
            teclado.nextLine();
            //Controla si el usuario quiere seguir ingresando datos o no 
            if (opcion.equals("n")) {
                datos = false;
            //Si el usuario ya no desea ingresar datos imprime el String.format
                System.out.printf(salida);
            } else {
            /**Si el usuario desea seguir ingresando datos la variable datos 
            que controla el While se vuelve false y se inicia nuevamente 
             el programa
            */
                datos = true;
                rep = rep + 1;
                cont = 1;
                salida = String.format("%sReporte Gastos Padres de Familia\n\n", salida);
                salida = String.format("%sReporte:00%d\n\n", salida, rep);
             
            }

        }

    }
}
