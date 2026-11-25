/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author JUSTINN LEONARDO FEIJOO PALADINES
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantPares = 0, cantImpares = 0;
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares += numeros[i];
            } else {
                cantImpares++;
                sumaImpares += numeros[i];
            }
        }

        System.out.println("Cantidad de pares: " + cantPares);
        System.out.println("Cantidad de impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
        teclado.close();
    }
}

