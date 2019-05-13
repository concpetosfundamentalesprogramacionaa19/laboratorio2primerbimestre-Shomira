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
      /**  Desarrollar una aplicación en Java que permita ingresar información de varios padres de familia.
 La información que se necesita por cada padre de familia es:

Nombres y apellidos del padre de familia.
Sueldo semanal del padre de familia.
Número de hijos del padre de familia
Por cada hijo se debe preguntar el gasto semanal que tienen para: pasajes, bar, salidas
*/
        Scanner teclado = new Scanner(System.in);
           String salida ="";
        boolean datos = true;
        int contador = 1;
        int rep = 001;
        salida = String.format("%s Reporte Gastos Padres de Familia\n\n",salida);
        while(datos){
            salida = String.format("%sReporte%d\n\n",salida,rep);
            System.out.println("Ingrese nombres y apellidos del padre de familia: ");
            String nom_ap = teclado.nextLine();
            
            System.out.println("Ingrese el sueldo del padre de familia: ");
            double sueldo = teclado.nextDouble();

            System.out.println("Ingrese el numero de hijos del padre de familia: ");
            int num_hj = teclado.nextInt();
                
            while(contador <= num_hj){   
                System.out.println("Ingreso de gastos semanal de Hijo"+contador+" en :" 
                        + " PASAJES, BAR, SALIDAS ");
                System.out.println("Gastos en pasajes del hijo"+contador+": ");
                double pasajes = teclado.nextDouble();

                System.out.println(" Gastos de bar del hijo"+contador+" : ");
                double bar = teclado.nextDouble();

                System.out.println("Gastos en salidas del hijo"+contador+" : ");
                double salidas = teclado.nextDouble();

                    contador= contador + 1;
                salida = String.format("%s Nombre Padre de Familia: %s\n Sueldo"
                        + " Semanal: $%.0f\n Numero de Hijos:%d\n\n Persona\t"
                        + "Pasaje\t\t Bar\t\t Salidas\n\n Hijo%d\t\t %.1f\t\t"
                        + "%.1f\t\t %.1f\n\n ",salida, nom_ap,sueldo,num_hj,
                        contador,pasajes,bar,salidas );
                 }
                System.out.println("Ingrese 's' si desea seguir y 'n' si desea salir");
                String opcion = teclado.next();
                if (opcion.equals("n")){
                    datos = false; 
                    //System.out.println(salida);
                    System.out.printf(salida);
                }else{
                    rep = rep +1 ;
                }
    
        }
        
    }
}
    

