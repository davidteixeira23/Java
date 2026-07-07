/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosmatriznumeroseila;

/**
 *
 * @author David
 */
public class MinhaMatriz {
    String [][] matriz ={
        {"a","b","c","d","e"},
        {"f","g","h","i","j"},
        {"l","m","n","o","p"},
        {"q","r","s","t","u"},
    };
    
    public void gap () {
    for (int i=0; i<matriz.length; i++) {
  
    for (int j = 0; j <matriz[i].length; j++){
System.out.print(matriz[i][j] + " ");
}
System.out.println();

}
    }
}

