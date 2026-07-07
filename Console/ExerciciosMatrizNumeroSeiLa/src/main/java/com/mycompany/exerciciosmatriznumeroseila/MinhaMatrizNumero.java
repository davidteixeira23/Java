/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosmatriznumeroseila;

/**
 *
 * @author David
 */
public class MinhaMatrizNumero {
    
    int[][] MNumeros = {
        {19,25,100,99},
        {10,7,25,14},
        {35,2,47,74},
     

};
    
    public void gap2 () {
    for (int i = 0; i < MNumeros.length; i++) {

   for (int j = 0; j < MNumeros[i].length; j++) {
   System.out.print(MNumeros [i] [j] + " ");
}
       System.out.println();
    }

    }
}
