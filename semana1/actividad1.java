/*
 * Programa para hallar el IMC de una persona
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Annette
 */
public class actividad1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double imc , peso , altura;
       
        System.out.println("Ingrese su peso en kilogramos:");
        peso = teclado.nextDouble();
        System.out.println("Ingrese su altura en metros:");
        altura = teclado.nextDouble();
       
        imc = peso / (altura*altura);
       
        System.out.println("Ingrese su peso en kilogramos:" + peso);
        System.out.println("Ingrese su altura en metros:" + altura);
        System.out.println("----Reporte---");
        System.out.println("--------------");
        System.out.println("Peso " + peso);
        System.out.println("Altura " + altura);
        System.out.println("El IMC es " + imc);
    }
}