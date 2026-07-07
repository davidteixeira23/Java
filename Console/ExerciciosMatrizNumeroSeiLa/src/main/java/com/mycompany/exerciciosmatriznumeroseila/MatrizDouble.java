/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosmatriznumeroseila;

/**
 *
 * @author David
 */
public class MatrizDouble {
    
    
    double[][] MatrizD = {
        {1.9, 2.5, 10.0},
        {1.0, 7.8, 2.5},
        {3.5, 2.2, 4.7},
        
    };
    
    public void gap3 (){
    for (int i=0; i< MatrizD.length; i++) {
    for (int j=0; j<MatrizD[i].length; j++) {
        System.out.print(MatrizD[i][j] + " ");
    }
            System.out.println();

    }
    
        
    }
    
    
    
}
