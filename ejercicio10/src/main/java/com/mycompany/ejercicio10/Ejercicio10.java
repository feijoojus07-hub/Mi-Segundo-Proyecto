/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

/**
 *
 * @author JUSTIN LEONARDO FEIJOO PALADINES
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int ingresado;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                ingresado = teclado.nextInt();
                // valor + (indice de fila * indice de columna), segun el ejemplo: 12 + (2 x 4) = 20
                matriz[i][j] = ingresado + (i * j);
            }
        }

        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        teclado.close();
    }
}

