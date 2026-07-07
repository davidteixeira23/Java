/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosmatriznumeroseila;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class SomaIntMatriz {
    
    Scanner scanner = new Scanner(System.in);
    int [][] Matriz = new int [5][5];

    public void gap4() {
   System.out.println("Digite os valores de uma matriz 5X5");

    for (int i=0; i<Matriz.length; i++) {
    for (int j=0; j<Matriz[i].length; j++) {
    Matriz[i][j] = scanner.nextInt();

    }
    }
    }
    public void Resultado () {
    System.out.println("\nMatriz:");
for (int i=0; i<Matriz.length; i++) {
    for (int j=0; j<Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + " ");
    
    }
            System.out.println();
    }
    }
    }
    
    
    
    

