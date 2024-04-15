/*
 * Programa para hallar el area y el perimetro de un  rectangulo
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author annette
 */
public class actividad3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base , altura , area , perimetro;
       
        System.out.println("Ingrese la base del rectangulo en metros: ");
        base = teclado.nextDouble();
        System.out.println("Ingrese la altura del rectangulo en metros: ");
        altura = teclado.nextDouble();
       
        area = base * altura;
        perimetro = 2 * (base + altura);
       
       
        System.out.println("--------------");
        System.out.println("Ingrese la base del rectangulo en metros: " + base);
        System.out.println("Ingrese la altura del rectangulo en metros: " + altura);
        System.out.println("----Reporte---");
        System.out.println("--------------");
        System.out.println("Base " + base);
        System.out.println("Altura " + altura);
        System.out.println("El area del rectangulo es : " + area + " metros cuadrados ");
        System.out.println("El perimetro del rectangulo es : " + perimetro + " metros ");
        System.out.println("--------------");
       
    }
}


