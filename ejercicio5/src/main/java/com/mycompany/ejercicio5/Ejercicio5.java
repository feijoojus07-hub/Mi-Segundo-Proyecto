/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author JUSTIN LEONARDO FEIJOO PALADINES
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[12];
        int ingresado;

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Ingrese un numero positivo para la posiciÃ³n " + i + ": ");
                ingresado = teclado.nextInt();
                if (ingresado <= 0) {
                    System.out.println("Debe ser positivo. Intente de nuevo.");
                }
            } while (ingresado <= 0);

            numeros[i] = ingresado + i;
        }

        System.out.println("\nArreglo final:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("PosiciÃ³n " + i + ": " + numeros[i]);
        }
        teclado.close();
    }
}
