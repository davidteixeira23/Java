/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversaonumerosromanos;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Calculo {

    public static String intToRoman(int num) {
        int[] valores = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] romanos = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                resultado.append(romanos[i]);
                num -= valores[i];
            }
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 3999: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 3999) {
            System.out.println("Número inválido!");
        } else {
            String romano = intToRoman(numero);
            System.out.println("Número romano: " + romano);
        }

        scanner.close();
    }
}
  
    
    
    
    
    
    
