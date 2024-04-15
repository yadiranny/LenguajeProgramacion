/*
 * Algoritmo para hallar area y el precio de un terreno rectangular
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author annette
 */
public class actividad2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area , largo , ancho , precio;
       
        System.out.println("Ingrese el largo en metros: ");
        largo = teclado.nextDouble();
        System.out.println("Ingrese el ancho en metros: ");
        ancho = teclado.nextDouble();
       
        area = largo * ancho;
        precio = area * 750;
               
               
        System.out.println("--------------");        
        System.out.println("Ingrese el largo en metros: ");  
        System.out.println("Ingrese el ancho en metros: ");
        System.out.println("----Reporte---");
        System.out.println("--------------");
        System.out.println("Largo " + largo);
        System.out.println("Ancho " + ancho);
        System.out.println("El area del terreno es: " + area + " metros cuadrados");
        System.out.println("El precio del terreno es: /S " + precio);
        System.out.println("--------------");
    }
}


