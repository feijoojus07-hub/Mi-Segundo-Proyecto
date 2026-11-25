/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author feijo
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
            suma += numeros[i];
        }

        double promedio = suma / numeros.length;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        teclado.close();
    }
}

