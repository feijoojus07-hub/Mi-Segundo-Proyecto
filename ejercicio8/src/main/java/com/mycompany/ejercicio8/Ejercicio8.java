/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

/**
 *
 * @author JUSTIN LEONARDO FEIJOO PALADINES
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println("PosiciÃ³n [" + i + "][" + j + "]: " + matriz[i][j]);
                    suma += matriz[i][j];
                }
            }
        }

        System.out.println("Suma de la diagonal principal: " + suma);
        teclado.close();
    }
}

